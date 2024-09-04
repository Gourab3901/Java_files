/*Write a Java Program to Delete All Repeated Words in String.*/

import java.util.*;
public class Delete {
	public static void main(String[] args) {
		String s1="hello hello hello java java ";
		System.out.println("original : "+s1);
		countWords(s1);	}
	static void countWords(String s2) {
		String[] words=s2.split("\\s");
		for(int i=0;i<words.length;i++) {
			for(int j=0;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					if(i!=j) 
						words[i]="";	}	}	}
			System.out.println(" After Remove duplicate words :");
			for(int k=0;k<words.length;k++) {
				if(words[k] != "") {
					System.out.println(words[k]);		}}}}













