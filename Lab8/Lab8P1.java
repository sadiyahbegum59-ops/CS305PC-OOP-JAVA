import java.awt.event.*;
import java.awt.*;

class Lab8P1 extends Frame implements ActionListener{
Label label;
Lab8P1(){
	super("Demonstrate of MenuBar");
	MenuBar mb = new MenuBar();
	setMenuBar(mb);
	BorderLayout bl = new BorderLayout();
	setLayout(bl);
	
	setSize(500,400);
	setVisible(true);

	label = new Label();
	label.setFont(new Font("Arial",Font.BOLD,40));
	label.setBounds(100,10,100,500);
	label.setAlignment(label.CENTER);
	add(label,bl.CENTER);
	
	Menu file = new Menu("File");
	
	
	String[] menus = {"File","Edit","Help"};
	String[][] mi = {
		{"Open","Save","Close"},
		{"Cut","Copy","Paste"},
		{"About","Update","License"}
	};
	int x = 0,y = 0;
	
	for(String s : menus){
	y = 0;
	Menu m = new Menu(s);
	for(int i=0;i<3;i++){
	MenuItem mmi = new MenuItem(mi[x][y]);
	mmi.addActionListener(this);
	m.add(mmi);
	y++;
	}
	x++;
	mb.add(m);
	}
		addWindowListener(
		new WindowAdapter(){
	         public void windowClosing(WindowEvent we){
			dispose();
			}
		});
	}
	public void actionPerformed(ActionEvent ae){
	String mstr = ae.getActionCommand();
		if(mstr.equals("Close")){
	System.exit(0);
	}else{
	label.setText(mstr);
	}
}
	
	public static void main(String...args){
		new Lab8P1();
	}
}
