class Lab3p51 {

    String name;

    public void demonstrate() {
        System.out.println("I am a method in Lab3p51");
    }

    public void setName(String s) {
        this.name = s;
    }

    public String getName() {
        return this.name;
    }
}

class Lab3p52 extends Lab3p51 {

    @Override
    public void demonstrate() {
        System.out.println("I am a method in Lab3p52");
    }

    Lab3p52() {
        super();
        super.demonstrate();
    }
}

class Lab3p53 {

    public static void main(String... args) {

        Lab3p52 p = new Lab3p52();

        p.setName("ACE ENGG COLLEGE");
        System.out.println(p.getName());
        p.demonstrate();
    }
}
