import java.util.Scanner;
class Lab2P1 {
    public static void main (String...args){
  Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
     //s.nextLine();
     String op = sc.next();
     switch(op){
     case"++":
System.out.println("Post:"+(a++));
System.out.println("Pre :"+(a++));
break;
case"--":

System.out.println("Post:"+(a++));
System.out.println("Pre :"+(++a));
break;
case"+":
a = +a;
System.out.println("Unary +:"+(a));
break;
case"-":
a = -a;
System.out.println("Unary +:"+(a));
break;
         }
      }
}
