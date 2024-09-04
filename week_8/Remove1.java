/*Java Program to Remove all Characters in Second String which are Present in First String.*/

import java.util.*;
public class Remove1 {
	public static void main(String[] args) {
		String s1="hello java ";
		String s2="hello python";
		System.out.println("first : "+s1);
		System.out.println("second : "+s2);
		System.out.println(s(s2,s1));		}
	public static String s(String s1,String s2) {
		StringBuffer a=new StringBuffer();
		for(int i=0;i<s1.length();i++) {
			int flag=0;
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					flag=1;	}	}
			if(flag!=1) {
				a.append(s1.charAt(i));	}}
		return a.toString()	;}}














