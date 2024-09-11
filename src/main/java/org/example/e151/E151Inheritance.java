package org.example.e151;

public class E151Inheritance {
    public static void main(String[] args) {
        // Create a SavingsAccount object with no interest applied
        SavingsAccount savings = new SavingsAccount("John Doe", 1000.0, "123456789", 0.0);
        savings.deposit(50.0);
        savings.printAccountInfo();
        System.out.println();
        // Create a CheckingAccount object and withdraw more than the balance to use overdraft
        CheckingAccount checking = new CheckingAccount("Jane Smith", 500.0, "987654321", 100.0);
        checking.withdraw(550.0);
        checking.printAccountInfo();
    }
}

class BankAccount {
    // Instance Variables
    private String accountHolderName;
    private double balance;
    private String accountNumber;

    // Constructor
    public BankAccount(String accountHolderName, double balance, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // Deposit Method
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Print Account Info Method
    public void printAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Getter for balance (needed for subclasses)
    public double getBalance() {
        return balance;
    }

    // Setter for balance (needed for subclasses)
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// SavingsAccount.java
class SavingsAccount extends BankAccount {
    // Instance Variable
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountHolderName, double balance, String accountNumber, double interestRate) {
        super(accountHolderName, balance, accountNumber);
        this.interestRate = interestRate;
    }

    // Apply Interest Method
    public void applyInterest() {
        double interest = getBalance() * interestRate;
        setBalance(getBalance() + interest);
    }
}

// CheckingAccount.java
class CheckingAccount extends BankAccount {
    // Instance Variable
    private double overdraftLimit;

    // Constructor
    public CheckingAccount(String accountHolderName, double balance, String accountNumber, double overdraftLimit) {
        super(accountHolderName, balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    // Override Withdraw Method
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}
