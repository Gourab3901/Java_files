/*Define an exception called “NoMatchFoundException” that is thrown when a string is not equal to “University”.Write a program that uses this exception.  */

import java.util.Scanner;
class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);    }  }
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        try {
checkStringMatch(input);
System.out.println("String matches 'University'.");
        } catch (NoMatchFoundException e) {
System.out.println("Error: " + e.getMessage());        }
scanner.close();    }
    public static void checkStringMatch(String input) throws NoMatchFoundException {
        if (!input.equals("University")) {
            throw new NoMatchFoundException("The input string does not match 'University'."); }  } }

