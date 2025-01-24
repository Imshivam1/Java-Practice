public class BankAccount {
    private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter for accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(12345, 5000.0);
        account.deposit(2000);
        account.withdraw(1500);
        account.withdraw(6000); // Insufficient balance
        System.out.println("Account number:"+ account.getAccountNumber());
    }
}
/*
Private fields (accountNumber and balance) ensure encapsulation.
Getters and setters control access to these fields, ensuring validation and secure updates.
OUTPUT
Deposited: 2000.0, New Balance: 7000.0
Withdrawn: 1500.0, New Balance: 5500.0
Insufficient balance or invalid amount.
*/
