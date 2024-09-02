/*Implement the below Diagram.
Here, Asset class is an abstract class containing an abstract method displayDetails() method.
 Stock, bond and Savings class inherit the Asset class and displayDetails() method is defined in every class.

*/

abstract class Asset {
	private String descriptor;
private String date;
private double current_value;
public Asset(String descriptor, String date, double current_value) {
this.setDescriptor(descriptor);
this.setDate(date);
        this.setCurrent_value(current_value);    }
abstract void displayDetails();
	public void setDescriptor(String descriptor) {
		this.descriptor = descriptor;	}
	public String getDescriptor() {
		return descriptor;	}
	public void setDate(String date) {
		this.date = date;	}
	public String getDate() {
		return date;	}
	public void setCurrent_value(double current_value) {
		this.current_value = current_value;	}
	public double getCurrent_value() {
		return current_value;	}}

class Stock extends Asset{
	private int num_shares;
private double share_price;
private int asset;
public Stock(String descriptor, String date, double current_value, int num_shares, double share_price,int asset) {
super(descriptor, date, current_value);
        this.num_shares = num_shares;
        this.share_price = share_price;
        this.asset = asset;    }
void displayDetails() {
System.out.println("Stock: " + super.getDescriptor() + ", Date: " + super.getDate() + ", Current Value: " + super.getCurrent_value());
System.out.println("Number of shares: " + num_shares + ", Share price: " + share_price+ ", Asset: "+ asset);    }}

class Bond extends Asset{
	private double interest_rate;
	private int asset;
public Bond(String descriptor, String date, double current_value, double interest_rate,int asset) {
super(descriptor, date, current_value);
        this.interest_rate = interest_rate;
        this.asset = asset;    }
void displayDetails() {
System.out.println("Bond: " + super.getDescriptor() + ", Date: " + super.getDate() + ", Current Value: " + super.getCurrent_value());
System.out.println("Interest rate: " + interest_rate+", Asset: "+ asset);    }
}
class Savings extends Asset{
	private double interest_rate;
	private int asset;
public Savings(String descriptor, String date, double current_value, double interest_rate,int asset) {
super(descriptor, date, current_value);
        this.interest_rate = interest_rate;
        this.asset = asset;    }
void displayDetails() {
System.out.println("Savings: " + super.getDescriptor() + ", Date: " + super.getDate() + ", Current Value: " + super.getCurrent_value());
System.out.println("Interest rate: " + interest_rate+ ", Asset: "+ asset);    }}

public class Test9 {
public static void main(String args[]) {
Stock stock=new Stock("TCS","2023-02-20",2000.0,100,50.0,100000);
Bond bond=new Bond("Govt","2024-01-22",10000.0,3.5,450000);
Savings savings=new Savings("Personal","2022-01-10",2000.0,2.0,230000);
stock.displayDetails();
bond.displayDetails();
savings.displayDetails();}}







