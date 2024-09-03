/*Write a program that takes a value at the command line for which factorial is to be computed. The program must convert the string to its integer equivalent. 
There are three possible user input errors that can prevent the program from executing normally. 
• The first error is when the user provides no argument while executing the program and an ArrayIndexOutOfBoundsException is raised. 
You must write a catch block for this. 
• The second error is NumberFormatException that is raised in case the user provides a non-integer (float double) value at the command line. 
• The third error is IllegalArgumentException. This needs to be thrown manually if the value at the command line is 0.  
 */

public class Q5{
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new ArrayIndexOutOfBoundsException("No input provided. Please enter an integer.");    }
            int number = Integer.parseInt(args[0]);
            if (number == 0) {
                throw new IllegalArgumentException("Factorial of 0 is 1 by definition. Please enter a positive integer.");
            } else if (number < 0) {
                throw new IllegalArgumentException("Factorial is not defined for negative numbers. Please enter a positive integer.");      }
            long factorial = 1;
            for (int i = 1; i<= number; i++) {
                factorial *= i;            }
System.out.println("The factorial of " + number + " is: " + factorial);
        } catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
System.out.println("Error: The provided input is not an integer.");
        } catch (IllegalArgumentException e) {
System.out.println("Error: " + e.getMessage()); }  }  }



