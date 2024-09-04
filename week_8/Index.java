/*Write a Java Program to Know the Last Index of a Particular Word in a String.*/

import java.util.*;
public class Index {
	public static void main(String[] args) {
		String s1="hello world of java";
		System.out.println(s1);
	String w;
	Scanner sc=new Scanner(System.in);
	System.out.println("word :");
	w=sc.nextLine();
	int last=s1.lastIndexOf(w);
	if(last==-1) {
		System.out.println("not present");	}else {
		System.out.println("last index "+w+" is " +last);	}}}





















