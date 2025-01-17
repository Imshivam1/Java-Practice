class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    // Method to deposit money
    void deposit(double amount) {
    if (amount > 0) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    } else {
        System.out.println("Invalid amount. Deposit must be positive.");
    }
}


    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to check balance
    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Assign account details
        account.accountNumber = 123456;
        account.accountHolder = "Shivam";
        account.balance = 5000;

        // Perform operations
        account.checkBalance();
        account.deposit(1500);
        account.withdraw(2000);
        account.withdraw(6000); // Should show insufficient balance
    }
}
/*
Current balance: 5000.0
1500.0 deposited. New balance: 6500.0
2000.0 withdrawn. New balance: 4500.0
Insufficient balance!
*/