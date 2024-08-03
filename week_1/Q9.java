//Write a Java program to find maximum of three numbers. 

import java.util.*;
public class Q9{
public static void main(String[] args) {
int a,b,c,max=0;
Scanner sc=new Scanner(System.in);
System.out.println(“enter : “);
a=sc.nextInt();
b=sc.nextInt();	
c=sc.nextInt();
max=c>(a>b ? a:b) ? c:((a>b)?a:b);
System.out.println(“max :”+max); } }


