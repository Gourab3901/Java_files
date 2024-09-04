/*Write a Java Program to Sort String Ignoring Whitespaces and Repeating Characters Only Once.*/

import java.util.*;
public class Sort {
	public static void main(String[] args) {
		String s1="hello java";
		System.out.println(s1);
		String newString=sortString(s1);
		removeDuplicte(newString);	}
	static String sortString(String s1) {
		char t[]=s1.toCharArray();
		Arrays.sort(t);
		s1=new String(t);
		return s1;	}
	static void removeDuplicte(String s1) {
		int i=1,j=1;
		char a[]=s1.toCharArray();
		while(i!=a.length) {
			if(a[i]!=a[i-1]) {
				a[j]=a[i];
				j++;	}
			i++;	}
		s1=new String(a);
		System.out.println("after sort :"+s1.substring(0,j));	}}



















