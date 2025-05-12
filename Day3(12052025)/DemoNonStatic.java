class Car {
    String model = "Toyota";

    // Non-static inner class
    class Engine {
        int horsepower = 150;

        void showDetails() {
            System.out.println("Car model: " + model);  // Access outer class variable
            System.out.println("Engine horsepower: " + horsepower);
        }
    }
}

class DemoNonStatic {
    public static void main(String[] args) {
        Car car = new Car();                      // Outer class instance
        Car.Engine engine = car.new Engine();     // Inner class using outer class instance
        engine.showDetails();
    }
}
