interface Operable {
    void start();
    void stop();
}

interface Alert {
    void sendAlert(String msg);
}

interface Notification {
    void notifyUser(); 
}

class StreetLight implements Operable {
    public void start() {
        System.out.println("Street light is ON");
    }

    public void stop() {
        System.out.println("Street light is OFF");
    }
}

class TrafficSignal implements Operable {
    public void start() {
        System.out.println("Traffic Signal: Can Pass");
    }

    public void stop() {
        System.out.println("Traffic Signal: Should Stop!!");
    }
}

class Citizen implements Alert {
    private String name;

    Citizen(String name) {
        this.name = name;
    }

    public void sendAlert(String msg) {
        System.out.println("Alert to " + name + ": " + msg);
    }
}

class FireSensor implements Alert {
    public void sendAlert(String msg) {
        System.out.println("Fire Alert: " + msg);
    }
}

class Sms implements Notification {
    public void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
}

class SmartBuilding {
    private Operable light;
    private Alert sensor;

    SmartBuilding(Operable light, Alert sensor) {
        this.light = light;
        this.sensor = sensor;
    }

    void operateBuilding() {
        light.start();
        sensor.sendAlert("Alert from SmartBuilding");
        light.stop();
    }
}

public class SmartInterface {
    public static void main(String[] args) {
        Operable light = new StreetLight();
        Operable signal = new TrafficSignal();

        System.out.println("--- Individual Component Actions ---");
        light.start();
        signal.start();

        Alert fireSensor = new FireSensor();
        fireSensor.sendAlert("Smoke detected!");

        Citizen citizen = new Citizen("John");
        citizen.sendAlert("Power gone");

        Notification sms = new Sms();
        sms.notifyUser();

        System.out.println("--- Smart Building Automation ---");
        SmartBuilding building = new SmartBuilding(new StreetLight(), new FireSensor());
        building.operateBuilding();
    }
}
