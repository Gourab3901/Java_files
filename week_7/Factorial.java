/*Write a program called Factorial.java that computes factorials and catches the result in an array of type long for reuse. 
The long type of variable has its own range. For example 20! Is as high as the range of long type. So check the argument passes and “throw an exception”, if it is too big or too small. 
• If x is less than 0 throw an IllegalArgumentException with a message “Value of x must be positive”. 
• If x is above the length of the array throw an IllegalArgumentException with a message “Result will overflow”. 
Here x is the value for which we want to find the factorial. 
 */

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
System.out.print("Enter a positive integer (less than or equal to 20): ");
            int x = scanner.nextInt();
            if (x < 0) {
                throw new IllegalArgumentException("Value of x must be positive");       }
            if (x > 20) {
                throw new IllegalArgumentException("Result will overflow");        }
long[] factorialArray = new long[x + 1];
factorialArray[0] = 1;
            for (int i = 1; i<= x; i++) {
factorialArray[i] = factorialArray[i - 1] * i;    }
System.out.println("Factorial of " + x + " is: " + factorialArray[x]);
        } catch (IllegalArgumentException e) {
System.err.println(e.getMessage());     }    }  }


