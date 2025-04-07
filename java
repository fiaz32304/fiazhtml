import java.util.Scanner;
// Final class representing a Bank Account
final class BankAccount {
    private final int accountNumber = 12; // Fixed account number
    private final double accountBalance = 70; // Initial account balance
    // Method to check balance
    public double checkBalance() {
        return accountBalance;
    }
    // Method to attempt modifying balance (not actually modifying due to final variable)
    public double calculateNewBalance(double amount) {
        return this.accountBalance + amount;
    }
}
public class Lab {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount();
        // Display modified balance (not actually modifying due to final variable)
        System.out.println("Modified balance is: " + account.calculateNewBalance(90));
        // Display original balance
        System.out.println("Original balance is: " + account.checkBalance());
    }
}