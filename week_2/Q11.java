//Write a Java program to find LCM of two Numbers. 

import java.util.*;
public class Q11{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number:");
int n=sc.nextInt();
int m=sc.nextInt();
int lcm = (n>m) ? n : m;
while(true) {
if( lcm % n == 0 && lcm % m == 0 ) {
System.out.printf("The LCM of %d and %d is %d.", n, m, lcm);
break; }
++lcm;
} } }










