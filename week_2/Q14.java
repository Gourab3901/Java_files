//Write a Java program to check whether a number is palindrome or not.

import java.util.*;
public class Q14{
public static void main(String[] args) {
int reverse = 0, r, temp;
Scanner sc = new Scanner(System.in);
System.out.print("Enter base:");
int n=sc.nextInt();
temp=n;
while (temp != 0) {
r = temp % 10;
reverse = reverse * 10 + r;
temp /= 10; };
if (n == reverse)
System.out.println (" is Palindrome");
else
System.out.println (" is not Palindrome");
} }













