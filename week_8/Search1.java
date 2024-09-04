/*Write a Java Program to Accept 2 String & Check Whether all Characters in First String is Present in Second String & Print.*/

public class Search1 {
	public static void main(String[] args) {
		String s1="riaip";
		String s2="riaak";
		boolean isPresent=false;
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++){
				if(s1.charAt(i)==s2.charAt(j)) {
					isPresent=true;	
					break;	}else {
					isPresent=false;	}}
			if(!isPresent) {
				System.out.println("not all the characters of string1 is present in string2");
				break;	}}
		if(isPresent) {
			System.out.println(" all the characters of string1 is present in string2");	}}}























