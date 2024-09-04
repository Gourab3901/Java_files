/*Write a Java Program to Validate an Email Address Format*/

import java.util.regex.Pattern; 
public class Email{ 
    public static boolean isValid(String email)     { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"; 
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches();     } 
    public static void main(String[] args)     { 
        String email1 = "java@gmail.com"; 
        String email2 = "Java@gmail.com";
        String email3 = "java3901.gmail.com";
        String[] emails= {email1,email2,email3};
        for (int i = 0; i < emails.length; i++) {
            String email=emails[i];
            if (isValid(email)) 
                System.out.print(email+" is valid email"); 
            else
                System.out.print(email+" is invalid email"); 
            System.out.println();        }    } }























