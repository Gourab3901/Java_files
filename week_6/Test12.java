/*Program to create a interface 'Mango' and implement it in classes 'Winter' and 'Summer'.
*/

interface Mango {
	void display();}
class Summer implements Mango{
	private int price;
	public Summer(int price){
		setPrice(price);	}
	public int getPrice() {
		return price;	}
	public void setPrice(int price) {
		this.price = price;	}
	public void display(){
		System.out.println("\nThe price of mangoes per kilo in summer is: "+price);	}}

class Winter implements Mango{
	private int price;
	public Winter(int price){
		setPrice(price);	}
	public int getPrice() {
		return price;	}
	public void setPrice(int price) {
		this.price = price;	}
	public void display(){
		System.out.println("\nThe price of mangoes per kilo in Winter is: "+price);	}}

public class Test12 {
	public static void main(String[] args) {
       Summer s= new Summer(400);
       Winter w=new Winter(1000);
s.display();
w.display();	}}








