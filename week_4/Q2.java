/*Write a Java program to show method overloading. */

import java.util.Scanner;
public class Q2{
static int add(int a, int b) {		// Method with two integer parameters
return a + b; }
static int add(int a, int b, int c) {		// Method with three integer parameters
return a + b + c; }
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter two integers:");
int num1 = sc.nextInt();
int num2 = sc.nextInt();
System.out.println("Sum of " + num1 + " and " + num2 + " is: " + add(num1, num2));
System.out.println("Enter three integers:");
int num3 = sc.nextInt();
int num4 = sc.nextInt();
int num5 = sc.nextInt();
System.out.println("Sum of " + num3 + ", " + num4 + " and " + num5 + " is: " + add(num3, num4, num5)); } }


