/*Write a Java program using try and catch to generate NegativeArrayIndex Exception and Arithmetic Exception. */

public class Q2 {
    public static void main(String[] args) {
        try {
int[] myArray = new int[-5];
        } catch (NegativeArraySizeException e) {
System.out.println("Caught an exception: Cannot create an array with negative size.");
System.out.println("Exception details: " + e.toString());        }
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
System.out.println("Caught an exception: Cannot divide by zero.");
System.out.println("Exception details: " + e.toString());        }    }  }
     }    }  }
