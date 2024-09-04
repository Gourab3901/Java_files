/*Design a palindrome class that will input a string from console and check whether the string is palindrome or not.*/

import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		String str,r="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter : ");
		str=sc.nextLine();
		int l=str.length();
		for(int i=l-1;i>=0;i--)
			r=r+str.charAt(i);
		if(str.equals(r))
			System.out.println("Palindrome");
		else
			System.out.println("not palindrome");	}}
