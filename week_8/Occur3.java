/*Write a Java Program to Check whether a Given Character is Present in a String, Find Frequency & Position of Occurrence*/

import java.util.*;
public class Occur3 {
	public static void main(String[] args) {
		String s1="hello world";
		System.out.println(s1);
Scanner sc=new Scanner(System.in);
char ch;
int i=0,f=0;
System.out.println("enter ch :");
ch=sc.next().charAt(0);
while(i<s1.length()) {
	if(s1.charAt(i)==ch) {
		f++;
		System.out.format("\n %c found at position %d",ch,i+1);}
	i++;}
System.out.println("\n frequency : "+f);	}}























