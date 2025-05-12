interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using UPI.");
    }
}

public class InterfacePaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPI();
        p1.pay(1500);
        p2.pay(450.75);
    }
}
