/*Write a Java program to show the use of all keywords for exception handling. */

public class Q1 {
    static void checkAge(int age) throws ArithmeticException {
if(age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
System.out.println("Access granted - You are old enough!");        }    }
    public static void main(String[] args) {
        try {
            int result = 30 / 0;
System.out.println(result);        } 
        catch (ArithmeticException e) {
System.out.println("Caught an arithmetic exception: " + e.getMessage());        } 
        finally {
System.out.println("The 'try catch' is finished.");        }
        try {
checkAge(15);
        } catch (ArithmeticException e) {
System.out.println("Caught an exception: " + e.getMessage());        }    }  }
