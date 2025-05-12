class A { 
    private String name;

    A() {
        
    }

    class B {  
        String college = "";

        B() {
            name = "sivam";      
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
        A outer = new A();           
        A.B inner = outer.new B();    
        inner.display();              
    }
}
