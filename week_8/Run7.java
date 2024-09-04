/*Write a Java Program to Make First Character of Each Word in Uppercase*/

import java.util.*;
public class Run7 {
	public static void main(String[] args) {
		String s1="hello world of java";
		char[] a=s1.toCharArray();
		System.out.println("before : "+s1);
		for(int i=0;i<a.length;i++) {
			a[0]=Character.toUpperCase(a[0]);
			if(a[i]==' ') {
				a[i+1]=Character.toUpperCase(a[i+1]);		} }		
s1=String.valueOf(a);
		System.out.println("after : "+s1);	}}












