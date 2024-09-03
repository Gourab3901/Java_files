/*Create a user-defined exception named CheckArgument to check the number of arguments passed through the command line. 
If the number of argument is less than 5, throw the CheckArgumentexception,else print the addition of all the five numbers.  
 */

import java.util.Scanner;
class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);    }  }
public class Q6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
System.out.print("Enter 5 numbers separated by spaces: ");
            String input = scanner.nextLine();
String[] numberStrings = input.split(" ");
            if (numberStrings.length< 5) {
            throw new CheckArgument("Insufficient arguments. Please provide at least 5 numbers.");}
            int sum = 0;
            for (String numStr :numberStrings) {
                int num = Integer.parseInt(numStr);
                sum += num;    }
System.out.println("Sum of the five numbers: " + sum);
        } catch (CheckArgument e) {
System.err.println(e.getMessage());
        } catch (NumberFormatException e) {
System.err.println("Invalid input. Please enter valid integers.");   }   }  }




