//Write a Java program to calculate factorial of 12. 

import java.util.*;
public class Q2{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
double n;
System.out.println("enter : ");
n=sc.nextDouble();
int i=1,fact=1;
while(i<=n) {
fact=fact*i;
i++; }
System.out.println("factorial : "+fact);
} }


