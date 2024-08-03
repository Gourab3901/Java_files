//Write a Java program to reverse a number. 

import java.util.*;
public class Q4{
public static void main(String[] args) {
int m, n, rev = 0;
Scanner s = new Scanner(System.in);
System.out.print("Enter the number:");
m = s.nextInt();
while(m > 0) {
n = m % 10;
rev = rev * 10 + n;
m = m / 10; }
System.out.println("Reverse of a Number is "+rev);
} }



