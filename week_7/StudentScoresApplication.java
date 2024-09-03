/*Write an application that displays a series of at least five student ID numbers (that you have stored in an array) and asks the user to enter a numeric test score for the student. 
Create a ScoreException class, and throw a ScoreException for the class if the user does not enter a valid score (zero to 100). 
Catch the ScoreException and then display an appropriate message. In addition, store a 0 for the student’s score. 
At the end of the application, display all the student IDs and scores. 
 */

import java.util.Scanner;
class ScoreException extends Exception {
    public ScoreException(String message) {
        super(message);    }  }
public class StudentScoresApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int[] studentIDs = {101, 102, 103, 104, 105};
int[] scores = new int[studentIDs.length]; 
        for (int i = 0; i<studentIDs.length; i++) {
System.out.println("Enter score for student ID " + studentIDs[i] + ": ");
            try {
                int score = scanner.nextInt();
                if (score < 0 || score > 100) {
                throw new ScoreException("Invalid score. Scores must be between 0 and 100.");   }
                scores[i] = score; // Store valid score
            } catch (ScoreException e) {
System.out.println(e.getMessage() + " Setting score to 0.");
                scores[i] = 0;    }     }
System.out.println("\nAll Student Scores:");
        for (int i = 0; i<studentIDs.length; i++) {
System.out.println("Student ID: " + studentIDs[i] + ", Score: " + scores[i]);    }
scanner.close();    }  }

















