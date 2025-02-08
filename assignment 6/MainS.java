class BankAccountS {
    private double balance;  // Data is hidden

    public BankAccountS(double balance) {
        this.balance = balance;
    }

    public double getBalance() {  // Getter to access data
        return balance;
    }

    public void deposit(double amount) {  // Setter to modify data
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }
}

public class MainS {
    public static void main(String[] args) {
        BankAccountS acc = new BankAccountS(1000);
        acc.deposit(500);
        System.out.println("Balance: " + acc.getBalance()); // Output: 1500
    }
}
