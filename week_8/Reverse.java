/*Write a Java program for reverse a string. (String will be taken as user input through console)*/

import java.util.*;
public class Reverse {
	public static void main(String[] args) {
		String str,r="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter : ");
		str=sc.nextLine();
		int l=str.length();
		for(int i=l-1;i>=0;i--)
			r=r+str.charAt(i);
		System.out.println(r);	}}


