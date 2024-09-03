/*Write a program to throw user defined exception if the given number is not positive.  
 */

import java.util.Scanner;
class NotPositiveException extends Exception {
    public NotPositiveException(String message) {
        super(message);   }  }
public class PositiveNumberValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number <= 0) {
                throw new NotPositiveException("The given number is not positive.");    }
System.out.println("The entered number is positive: " + number);
        } catch (NotPositiveException e) {
System.out.println(e.getMessage());
        } finally {
scanner.close();    }    }  }














