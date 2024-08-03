//Write a Java program to change temperature from Celsius to Fahrenheit and vice versa. 

import java.util.*;
public class Q3_Q4{
public static void main(String[] args) {
double c,f;
int ch;
Scanner sc = new Scanner(System.in);
System.out.println(“1.C to F\n2.F to C”);
ch=sc.nextInt();
switch(ch) {
case 1: System.out.println(“Celcius :”);
c=sc.nextDouble();
f=((9*c)/5)+32;
System.out.println(“in Farenheit :”+f);
break;
case 2: System.out.println(“Farenheit :”);
f=sc.nextDouble();
c=(f-32)*5/9;
System.out.println(“in Celcius :”+c);
break;
default : System.out.println(“error”);  } } 
