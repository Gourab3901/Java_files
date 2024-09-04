/*Write a Java Program to Find First and Last Occurrence of Given Character in a String.*/

import java.util.*;
public class Occur2 {
	public static void main(String[] args) {
		String s1="i am learning java";
		System.out.println(s1);
		int i,c=0,p1=0,p2 = 0;
		char key;
		System.out.println("enter ch : ");
		Scanner sc=new Scanner(System.in);
		key=sc.next().charAt(0);
		for(i=0;i<s1.length();i++) {
			if(key==s1.charAt(i)) {
				c++;
				if(c==1) {
					p1=i+1;
					p2=i+1;
					System.out.println("first at :"+p1);}else {
					p2=i+1;	}}}
		System.out.println("last at : "+p2);}}

















