class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String name, double initialAmount) {
        this.accountHolder = name;
        this.balance = initialAmount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited. New balance: $" + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class EncapsulationBankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ravi", 5000);
        System.out.println("Initial bank balance: $ "+ acc.getBalance());
        acc.deposit(2000);
        acc.withdraw(3000);
        System.out.println("Final Balance: $" + acc.getBalance());
    }
}