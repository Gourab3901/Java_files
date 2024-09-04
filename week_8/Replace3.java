/*Write a Java Program to Count Replace First Occurrence of a String*/

import java.util.*;
public class Replace3 {
	public static void main(String[] args) {
		String s1="hello world of java";
		System.out.println(s1);
	char r,n;
	int i=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("ch to replace :");
	r=sc.nextLine().charAt(0);
	System.out.println("new ch :");
	n=sc.nextLine().charAt(0);
	char[] l=s1.toCharArray();
	while(i<l.length) {
		if(l[i]==r) {
			l[i]=n;
			break;	}
i++;	}
	System.out.println(l);	}}




















