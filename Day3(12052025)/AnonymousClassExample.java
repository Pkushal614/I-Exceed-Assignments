abstract class Animal {
    abstract void sound();
}

public class AnonymousClassExample {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            void sound() {
                System.out.println("Dog barks");
            }
        };

        dog.sound();  
    }
}

