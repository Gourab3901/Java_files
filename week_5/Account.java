/*Design a class named Account that contains: 
I. A private int data field named id for the account (default 0). 
II. A private double data field named balance for the account (default 0). 
III. A private double data field named annualInterestRate that stores the cur-rent interest rate (default 0). Assume all accounts have the same interest rate. 
IV. A private Date data field named dateCreated that stores the date when the account was created. 
V. A no-arg constructor that creates a default account. 
VI. A constructor that creates an account with the specified id and initial balance. 
VII. The accessor and mutator methods for id,balance, and annualInterestRate. 
VIII. The accessor method for dateCreated. 
IX. A method named getMonthlyInterestRate() that returns the monthly interest rate. 
X. A method named getMonthlyInterest() that returns the monthly interest. 
XI. A method named withdraw that withdraws a specified amount from the account. 
XII. A method named deposit that deposits a specified amount to the account.*/

import java.util.Date;
public class Account {
private int id;
private double balance;
private double annualInterestRate;
private Date dateCreated;
public Account() {
this(0, 0); }
public Account(int id, double initialBalance) {
this.id = id;
this.balance = initialBalance;
this.annualInterestRate = 0;
this.dateCreated = new Date(); }
public int getId() {
return id; }
public void setId(int id) {
this.id = id; }
public double getBalance() {
return balance; }
public void setBalance(double balance) {
this.balance = balance; }
public double getAnnualInterestRate() {
return annualInterestRate; }
public void setAnnualInterestRate(double annualInterestRate) {
this.annualInterestRate = annualInterestRate; }
public Date getDateCreated() {
return dateCreated; }
public double getMonthlyInterestRate() {
return annualInterestRate / 12 / 100; }
public double getMonthlyInterest() {
return balance * getMonthlyInterestRate(); }
public void withdraw(double amount) {
if (amount > 0 && amount <= balance) {
balance -= amount;
} else {
System.out.println("Not sufficient money for account ID->"+this.id); } }
public void deposit(double amount) {
if (amount > 0) {
balance += amount;
} else {
System.out.println("Invalid deposit amount."); }}
public static void main(String[] args) {
Account account1 = new Account();
System.out.println("Account 1 - ID: " + account1.getId() + ", Balance: $" + account1.getBalance());
Account account2 = new Account(12345, 1000.0);
System.out.println("Account 2 - ID: " + account2.getId() + ", Balance: $" + account2.getBalance());
account1.setAnnualInterestRate(3.5);
account2.setAnnualInterestRate(4.2);
account1.withdraw(200);
account2.deposit(500);
System.out.println("Account 1 - Balance: $" + account1.getBalance() +", Monthly Interest: $" + account1.getMonthlyInterest() +", Date Created: " + account1.getDateCreated());
System.out.println("Account 2 - Balance: $" + account2.getBalance() +", Monthly Interest: $" + account2.getMonthlyInterest() +", Date Created: " + account2.getDateCreated()); } }
