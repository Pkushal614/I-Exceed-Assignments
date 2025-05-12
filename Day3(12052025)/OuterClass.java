public class OuterClass {

    int outerValue = 100;

    // Non-static nested class (Inner class)
    class InnerClass {
        void display() {
            System.out.println("Outer value is: " + outerValue);
        }
    }

    // Static nested class
    static class StaticNestedClass {
        void show() {
            System.out.println("Inside static nested class.");
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();


        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.show();
    }
}
