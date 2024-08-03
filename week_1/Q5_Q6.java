//Write a Java program to find area and perimeter of a rectangle and a circle. 

import java.util.*;
public class Q5_Q6 {
public static void main(String[] args) {
double l,b,r;
int ch;
Scanner sc = new Scanner(System.in);
System.out.println(“1.rectangle\n2.circle”);
ch=sc.nextInt();
switch(ch) {
case 1: System.out.println(“rectange’ length and breath :”);
l=sc.nextDouble();
b=sc.nextDouble();
System.out.println(“perimeter :”+2*(l+b));
System.out.println(“area :”+(l*b));
break;
case 2: System.out.println(“circle’s radius :”);
r=sc.nextDouble();
System.out.println(“perimeter :”+(2*3.14*r));
System.out.println(“area :”+(3.14*r*r));
break;
default : System.out.println(“error”); } } }

