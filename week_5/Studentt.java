/*Write a program to demonstrate use of 'this' keyword. */

class Studentt {
String name;
int age;
Studentt(String name, int age) {		// Parameterized constructor using 'this' keyword
this.name = name;
this.age = age; } 
void displayInfo() {
System.out.println("Student Name: " + this.name);		// Method using 'this' keyword to refer to instance variables
System.out.println("Student Age: " + this.age); }
public static void main(String[] args) {
Studentt student1 = new Studentt("John Doe", 20);
student1.displayInfo(); } }


