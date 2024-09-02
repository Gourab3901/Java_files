/*Write a Java program to implement the concept of inheritance.  */

class stu {
String name;
public void message() {
System.out.println("I am student of MCA"); } }
class Name extends stu {
public void display() {
System.out.println("My name is " + name); } }
class Q1{
public static void main(String[] args) {
Name ob = new Name();
ob.name = "Hello";
ob.display();
ob.message(); } }

