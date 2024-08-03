//Write a Java program to check whether a number is prime or not. 

import java.util.*;
public class Q15{
public static void main(String[] args) {
int l, u, n, flag = 0, i, j;
Scanner sc = new Scanner(System.in);
System.out.println ("Enter the lower limit :");
l = sc.nextInt();
System.out.println ("Enter the upper limit :");
u = sc.nextInt();
System.out.println ("The prime numbers are :");
for(i = l; i <= u; i++) {
for( j = 2; j < i; j++) {
if(i % j == 0) {
flag = 0;
break; }
else { flag = 1; } }
if(flag == 1) { System.out.println(i); } }
} }














