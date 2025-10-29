class Lab3p4 {

    Lab3p4() {
        System.out.println("Constructor without parameters");
    }

    Lab3p4(int x) {
        System.out.println("Constructor with 1 parameter");
    }

    Lab3p4(String s) {
        System.out.println("Constructor with String parameter");
    }

    Lab3p4(int x, String s) {
        System.out.println("Constructor with int + String parameters");
    }

    public static void main(String... args) {

        Lab3p4 l1 = new Lab3p4();
        Lab3p4 l2 = new Lab3p4(20);
        Lab3p4 l3 = new Lab3p4("String");
        Lab3p4 l4 = new Lab3p4(20, "String");
    }
}
