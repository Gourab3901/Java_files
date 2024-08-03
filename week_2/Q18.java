//Write a Java program to check whether a given number is Armstrong Number or not. 

import java.util.*;
public class Q18{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter : ");
n=sc.nextInt();
int  original, remainder, result = 0;
original = n;
while (original != 0) {
remainder = original% 10;
result += Math.pow(remainder, 3);
original /= 10; }
if(result == n)
System.out.println(" is an Armstrong number.");
else
System.out.println( " is not an Armstrong number."); } }


















