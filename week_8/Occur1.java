/*a Java Program to Find the Consecutive Occurrence of any Vowel in a String.*/

import java.util.*;
public class Occur1 {
	public static void main(String[] args) {
		String s1="school ";
		System.out.println(s1);
		char[] s=s1.toCharArray()	;
		for(int i=0;i<s.length-1;i++) {
			if(isVowel(s[i])&& isVowel(s[i+1])) {
				System.out.println("found : "+s[i]+" "+s[i+1]);}}}
	static Boolean isVowel(char c) {
		if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')
			return true;
		else
			return false;	}	}















