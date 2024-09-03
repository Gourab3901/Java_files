/*a program to input name and age of a person and throw a user-defined exception, if the entered age is negative.  
 */

import java.util.Scanner;
class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);    }  }
public class AgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
System.out.print("Enter your name: ");
            String name = scanner.nextLine();
System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative.");      }
System.out.println("Hello, " + name + ". Your age is " + age + ".");
        } catch (NegativeAgeException e) {
System.out.println(e.getMessage());
        } finally {
scanner.close();    }    }  }













