/*Write a program to implement the Multiple Inheritance (Bank Interface, Customer & Account classes).
*/

interface Bank {
	void deposit(double amount);
void withdraw(double amount);}

interface Customer {
	void display();}

interface Account extends Bank, Customer{
	double checkBalance();}

class SavingAccount implements Account{
	private double balance;
private String customerName;

public SavingAccount(String customerName) {
        this.customerName = customerName;
        this.balance = 0.0;    }
public void deposit(double amount) {
balance += amount;    }
public void withdraw(double amount) {
if (balance >= amount) {
balance -= amount;        } else {
System.out.println("Insufficient funds!");        }    }
public double checkBalance() {
return balance;    }
public void display() {
System.out.println("Customer Name: " + customerName);
System.out.println("Account Balance: " + balance);    }

public static void main(String[] args) {
        SavingAccount account = new SavingAccount("Gourab Nandi");
account.deposit(5000);
account.withdraw(1000);
account.display();    }}









