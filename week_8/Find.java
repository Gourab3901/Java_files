/*Write a Java Program to Find the Largest & Smallest Word in a String.*/

import java.util.*;
public class Find {
	public static void main(String[] args) {
		String s1="i am learning java ";
		System.out.println(s1);
		String word="",small="",large="";
		String[] words=new String[50];
		int l=0;
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)!=' ') {
			word=word+s1.charAt(i);		}
		else {
			words[l]=word;
			l++;
			word="";	}}
		small=large=words[0];
		for(int k=0;k<l;k++) {
			if(small.length()>words[k].length())
				small=words[k];		
		if(large.length()<words[k].length())
			large=words[k];	}
		System.out.println("smallest : "+small);
		System.out.println("largest : "+large);}}
















