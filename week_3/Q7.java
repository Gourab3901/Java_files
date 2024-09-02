/*Write a class, Commission, which has an instance variable, sales; an appropriate constructor; and a method, commission() that returns the commission.
 Now write a demo class to test the Commission class by reading a sale from the user, using it to create a Commission object after validating that the value is not negative. 
Finally, call the commission() method to get and print the commission. 
If the sales are negative, your demo should print the message “Invalid Input”. */

import java.util.*;
class Commision {
int sales;
static double commission_rate=0.1;
public Commision(int sales) {
this.sales=sales; }
public double getCommission(int sales) {
double commission = sales * commission_rate;
return commission; } }
public class Q7{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter your sales value->");
int sales=sc.nextInt();
if(sales < 0 ) {
System.out.println("Invalid Input"); }
else {
Commision obj=new Commision(sales);
System.out.println("your Commission  is->"+obj.getCommission(sales)); } } }
