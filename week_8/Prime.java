/*Write a Java Program to Display the Characters in Prime Position a Given String*/

import java.util.*;
public class Prime {
	public static void main(String[] args) {
		String s1="hello java";
		System.out.println(s1);
		prime_index(s1);	}
	static boolean isPrime(int n) {
		if(n<=1) return false;
		for(int i=2;i<n;i++)
			if(n%i==0)
				return false;
		return true;	}
	static void prime_index(String s1) {
		int n=s1.length();
		for(int i=2;i<=n;i++)
			if(isPrime(i))
				System.out.println(s1.charAt(i-1));	}}


















