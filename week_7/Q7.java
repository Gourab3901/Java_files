/*Consider a Student examination database system that prints the mark sheet of students. Input the following from the command line. 
(a) Student’s Name (b) Marks in six subjects These marks should be between 0 to 50. 
If the marks are not in the specified range, raise a RangeException, else find the total marks and prints the percentage of the students. 
 */

import java.util.Scanner;
class RangeException extends Exception {
    public RangeException(String message) {
        super(message);    }  }
public class Q7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
System.out.print("Enter student's name: ");
            String studentName = scanner.nextLine();
int[] marks = new int[6];
            for (int i = 0; i< 6; i++) {
System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
                if (marks[i] < 0 || marks[i] > 50) {
                    throw new RangeException("Marks should be between 0 and 50.");    }    }
            int totalMarks = 0;
            for (int mark : marks) {
totalMarks += mark;    }
            double percentage = (totalMarks / 300.0) * 100;
System.out.println("\nMark Sheet:");
System.out.println("Student Name: " + studentName);
System.out.println("Total Marks: " + totalMarks);
System.out.println("Percentage: " + percentage + "%");
        } catch (RangeException e) {
System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
System.err.println("An error occurred: " + e.getMessage());   }   }  }





