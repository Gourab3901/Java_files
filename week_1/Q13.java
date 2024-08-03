//Write a Java program for following grading system. 
Note: Percentage>=90% : Grade A Percentage>=80% : Grade B Percentage>=70% : Grade C Percentage>=60% : Grade D Percentage>=40% : Grade E Percentage<40% : Grade F 


import java.util.*;
public class Q13{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
double n;
System.out.println(“enter : “);
n=sc.nextDouble();
if(n>=90 && n<=100) {System.out.println(“A”);}
else if(n>=80 && n<90){System.out.println(“B”);}
else if(n>=70 && n<80){System.out.println(“C”);}
else if(n>=60 && n<70){System.out.println(“D”);}
else if(n>=40 && n<60){System.out.println(“E”);}
else if(n<40){System.out.println(“F”);}
else {System.out.println(“not”);} } }



