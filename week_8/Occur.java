/*Write a Java Program to Search Last Occurance of a Substring Inside a Substring.*/

import java.util.*;
public class Occur {
	public static void main(String[] args) {
		String s1="Hello World of Java";
		int l=s1.lastIndexOf("of");
		if(l==-1) {
			System.out.println("not found");		}
		else {
			System.out.println("last occurrence " +l);		}	}}







