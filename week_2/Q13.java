//Write a Java program to calculate the exponential of a number.  

import java.util.*;
public class Q13{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter base:");
int b=sc.nextInt();
System.out.print("Enter exponent:");
int e=sc.nextInt();
double r=b;
for (int i=1;i<e;i++) { r=r*b; }
System.out.println("exponent value is :"+r);
} }












