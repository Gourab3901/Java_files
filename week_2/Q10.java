//Write a Java program to find HCF of two Numbers. 

import java.util.*;
public class Q10{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number:");
int n=sc.nextInt();
int m=sc.nextInt();
while(n!=m) {
if(n>m)
n=n-m;
else
m=m-n; }
System.out.printf("GCD is: " +m);
} }









