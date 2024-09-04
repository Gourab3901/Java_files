/*Write a Java Program to Find All Possible Subsets of given Length in String.*/

import java.util.*;
public class Subset {
	public static void main(String[] args) {
		String s1="java";
		int l=s1.length();
		int temp=0;
		String a[]=new String[l*(l+1)/2];
		for(int i=0;i<l;i++) {			
			for(int j=i;j<l;j++) {
				a[temp]=s1.substring(i, j+1);
		temp++;			}		}		
		System.out.println("subsets : ");
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);		}	}}




