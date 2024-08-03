//Admission to a professional course is subject to the following conditions: 
(a) marks in Mathematics >= 60 (b) marks in Physics >=50 (c) marks in Chemistry >=40 (d) Total in all 3 subjects >=200 (Or) Total in Maths & Physics>=150 . Given the marks in the 3 subjects of n (user input) students, write a program to process the applications to list the eligible candidates. 

import java.util.*;
public class Q5{
public static void main(String[] args) {
int m, p, c ,s=0,mp=0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter number:");
m = sc.nextInt();
p = sc.nextInt();
c = sc.nextInt();
s=m+p+c;
mp=m+p;
if((m>=60)&&(p>=50)&&(c>=40)&&(s>=200)||(mp>=150))
System.out.println("Qualified");
else
System.out.println("Not Qualified");
} }




