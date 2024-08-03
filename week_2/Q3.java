//Write a Java program for Fibonacci series.

import java.util.*;
public class Q3{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
double n,a=0,b=0,c=1;
System.out.println("enter : ");
n=sc.nextDouble();
System.out.println(“fibonacci :”);
for(int i = 1; i <= n; i++)
System.out.println(“fibonacci :”); {
a = b;
b = c;
c = a + b;
System.out.println(a+" ");
} } }


