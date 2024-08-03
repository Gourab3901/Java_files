//a Java program to convert a Binary Number to Decimal and Decimal to Binary.  

import java.util.*;
public class Q16{
public static void main(String[] args) {
int ch;
Scanner sc = new Scanner(System.in);
System.out.println("1.b to d\n2.d to b");
ch=sc.nextInt();
switch(ch) {
case 1: int binaryNumber,decimalNumber = 0;
int base = 1;
System.out.println("binary no. :");
binaryNumber=sc.nextInt();
int temp = binaryNumber;
while (temp > 0) {
int lastDigit = temp % 10;
temp = temp / 10;
decimalNumber += lastDigit * base;
base = base * 2; }
System.out.println("Decimal number: " + decimalNumber);
break;
case 2: System.out.println("Enter decimal number");
int n=sc.nextInt();
int  bin[]=new int[100];
int i = 0;
while(n > 0) {
bin[i++] = n%2;
n = n/2; }
System.out.print("Binary number is : ");
for(int j = i-1;j >= 0;j--) {
System.out.print(bin[j]); }
break;
default : System.out.println("error"); }
} }















