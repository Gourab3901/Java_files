/* Create an abstract class Accounts with the following details: Data Members:
(a) Balance (b) accountNumber (c) accountHoldersName (d) address Methods:
(a) withdrawl()- abstract
(b) deposit()- abstract
(c) display() to show the balance of the account number
Create a subclass of this class SavingsAccount and add the following details:
Data Members:
(a) rateOfInterest
Methods:
(a) calculateAount()
*/

import java.util.Scanner;
abstract class Accounts {
	double balance;
int accountNumber;
    String accountHoldersName;
    String address;
public Accounts(double balance, int accountNumber, String accountHoldersName, String address) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;    }
abstract void withdrawal(double amount);
abstract void deposit(double amount);
void display() {
	System.out.println("Holders Name: " + accountHoldersName);
System.out.println("Account Number: " + accountNumber);
System.out.println("Balance: " + balance);    }}

class SavingsAccount extends Accounts{
	private double rateOfInterest;
public SavingsAccount(double balance, int accountNumber, String accountHoldersName, String address, double rateOfInterest) {
super(balance, accountNumber, accountHoldersName, address);
        this.rateOfInterest = rateOfInterest;    }
void calculateAmount() {
balance += balance * rateOfInterest;
System.out.println("New balance after interest: " + balance);    }
void withdrawal(double amount) {
if (amount > balance) {
System.out.println("Insufficient balance.");        } else {
balance -= amount;
System.out.println("Withdrawal successful. Remaining balance: " + balance);        }    }
void deposit(double amount) {
balance += amount;
System.out.println("Deposit successful. New balance: " + balance);    }}

public class Test7{
	public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 12345, "Gourab", "Baguiati", 7);
savingsAccount.display();
savingsAccount.deposit(500);
savingsAccount.withdrawal(200);
savingsAccount.calculateAmount();    }}





