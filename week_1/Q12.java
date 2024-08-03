//Java program to check whether a year is leap year or not. 

import java.util.*;
public class Q12{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
double y;
System.out.println(“enter : “);
y=sc.nextDouble();
if(((y%4==0)&& (y%100!=0))||(y%400==0))
System.out.println(“leap year”);
else
System.out.println(“ not leap year”); } }


