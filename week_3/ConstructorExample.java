/*i.  Write a Java program to show 0-arguments constructor. 
ii. Write a Java program to show parameterized constructor. 
iii. Write a Java program to show constructor overloading. */

public class ConstructorExample {	// 0 Argument (Default) Constructor
public ConstructorExample() {
System.out.println("Default constructor called."); }
public ConstructorExample(int intValue, String stringValue) {	// Parameterized Constructor
System.out.println("Parameterized constructor called with values: " + intValue + ", " + stringValue); }
public ConstructorExample(double doubleValue) {	// Constructor Overloading
System.out.println("Overloaded constructor called with value: " + doubleValue); }

public static void main(String[] args) {
ConstructorExample defaultConstructorObj = new ConstructorExample();
ConstructorExample parameterizedConstructorObj = new ConstructorExample(42, "Hello");
ConstructorExample overloadedConstructorObj = new ConstructorExample(3.14); } }

