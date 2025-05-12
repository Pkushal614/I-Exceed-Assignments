class A {  // outer class
    private String name;

    A() {
        // Constructor
    }

    class B {  // inner class
        String college = "";

        B() {
            name = "sivam";       // Valid: inner class can access outer class's private members
            college = "gce";
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("College: " + college);
        }
    }
}

class Demonested {
    public static void main(String[] args) {
        A outer = new A();            // Create outer class object
        A.B inner = outer.new B();    // Create inner class object using outer class instance
        inner.display();              // Print the values
    }
}
