/*Write a program to accept a password from the user and throw 'Authentication Failure' exception if the password is incorrect. 
 */

import java.util.Scanner;
class AuthenticationFailureException extends Exception {
    public AuthenticationFailureException(String message) {
        super(message);    }  }
public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String correctPassword = "secret123";
        try {
System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();
            if (!inputPassword.equals(correctPassword)) {
     throw new AuthenticationFailureException("Incorrect password. Authentication Failure.");  }
System.out.println("Authentication successful!");
        } catch (AuthenticationFailureException e) {
System.out.println(e.getMessage());
        } finally {
scanner.close();    }    }  }












