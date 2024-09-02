/*Write a Java program to show method overriding. */

import java.util.Scanner;
class Animal {
public void sound() {
System.out.println("Animal makes a sound"); } }
class Dog extends Animal {
@Override	
public void sound() {
System.out.println("Dog barks"); } }
class Cat extends Animal {
@Override
public void sound() {
System.out.println("Cat meows"); } }
public class Q3{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter 'dog' or 'cat' to hear the sound: ");
String aype = sc.nextLine();
Animal ob;
if (aype.equalsIgnoreCase("dog")) {
ob= new Dog(); // Dog object created
} else if (aype.equalsIgnoreCase("cat")) {
ob= new Cat(); // Cat object created
} else {
System.out.println("Invalid input. Please enter 'dog' or 'cat'.");
return; }
ob.sound();
sc.close(); } }



