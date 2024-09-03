/*Write a Java Program to Create Account with 500 Rs Minimum Balance, Deposit Amount, Withdraw Amount and Also Throws LessBalanceException. 
• Java Program Which has a Class Called LessBalanceException Which returns the Statement that Says WithDraw Amount(_Rs) is Not Valid 
• Java Program that has a Class Which Creates 2 Accounts, Both Account Deposit Money and One Account Tries to WithDraw more Money Which 
Generates a LessBalanceException Take Appropriate Action for the Same.  
 */

import java.util.Scanner;
class LessBalanceException extends Exception {
    public LessBalanceException(String message) {
        super(message);    }}
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        balance = initialBalance;    }
    public void deposit(double amount) {
        balance += amount;
System.out.println("Amount deposited successfully.");    }
    public void withdraw(double amount) throws LessBalanceException {
        if (balance >= amount) {
            balance -= amount;
System.out.println("Amount withdrawn successfully.");
        } else {
            throw new LessBalanceException("Insufficient balance for withdrawal.");        }    }
    public double getBalance() {
        return balance;    }}
public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("Enter initial balance for Account 1: ");
        double initialBalance1 = scanner.nextDouble();
BankAccount account1 = new BankAccount(initialBalance1);
System.out.print("Enter initial balance for Account 2: ");
        double initialBalance2 = scanner.nextDouble();
BankAccount account2 = new BankAccount(initialBalance2);
        try {
            account1.deposit(100); 
            account2.deposit(200);
            account1.withdraw(50); 
            account2.withdraw(300);          
        } catch (LessBalanceException e) {
System.out.println("Error: " + e.getMessage());       }
System.out.println("Account 1 balance: Rs " + account1.getBalance());
System.out.println("Account 2 balance: Rs " + account2.getBalance());    }}









