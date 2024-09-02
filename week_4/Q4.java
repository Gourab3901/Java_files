/*Write a Java program to show method hiding. */

class Superclass {
static void display() {
System.out.println("Static method in Superclass"); } }
class Subclass extends Superclass {
static void display() {
System.out.println("Static method in Subclass"); } }
public class Q4{
public static void main(String[] args) {
Superclass.display();	 // Output: Static method in Superclass
Subclass.display();	// Call the static method in Subclass
// Demonstrating method hiding   Access the static method in Subclass using Superclass reference
Superclass ref = new Subclass();
ref.display(); } }




