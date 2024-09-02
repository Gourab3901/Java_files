/*i. Write a Java program which creates a base class Num and contains an integer number along with a method shownum() which displays the number. 
Now create a derived class HexNum which inherits Num and overrides shownum() which displays the hexadecimal value of the number. Demonstrate the working of the classes. 

ii.  Write a Java program which creates a base class Num and contains an integer number along with a method shownum() which displays the number. 
Now create a derived class OctNum which inherits Num and overrides shownum() which displays the octal value of the number. Demonstrate the working of the classes. 
Combine Question number i and ii and have all the three classes together. Now describe the working of all classes.   */

import java.util.Scanner;
class Num {
protected int number;
public Num(int number) {
this.number = number; }
public void showNum() {
System.out.println("Number: " + number); } }
class HexNum extends Num {
public HexNum(int number) {
super(number); }
@Override
public void showNum() {
System.out.println("Hexadecimal Value: " + Integer.toHexString(number)); } } 
class OctNum extends Num {
public OctNum(int number) {
super(number); } 
@Override
public void showNum() {
System.out.println("Octal Value: " + Integer.toOctalString(number)); } }
public class num_hexnum_octnum {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter an integer number: ");
int number = scanner.nextInt();
Num num = new Num(number);
HexNum hexNum = new HexNum(number);
OctNum octNum = new OctNum(number);
System.out.println("\nDisplaying number using Num:");
num.showNum();
System.out.println("\nDisplaying number using HexNum:");
hexNum.showNum();
System.out.println("\nDisplaying number using OctNum:");
octNum.showNum();
scanner.close(); } }
