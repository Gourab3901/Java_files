/*Consider a Quiz Management System, where a user needs to answer 5 questions. 
If any of the answer is wrong, throw an exception “NotCorrectException”. 
If the answer is correct give a message “good! The answer is correct”.  
 */

import java.util.Scanner;
class NotCorrectException extends Exception {
    public NotCorrectException(String message) {
        super(message);    }  }
public class QuizManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String[] questions = {
                "What is the capital of France?",
                "What is the chemical symbol for gold?",
                "What is the capital of Japan?"   };
String[] answers = {"Paris", "Au", "Tokyo"};
        int score = 0;
        for (int i = 0; i<questions.length; i++) {
System.out.println((i + 1) + ". " + questions[i]);
System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();
            try {
                if (!userAnswer.equalsIgnoreCase(answers[i])) {
                    throw new NotCorrectException("NotCorrectException: Wrong answer!");
                } else {
System.out.println("Good! The answer is correct.");
                    score++;    }
            } catch (NotCorrectException e) {
System.out.println(e.getMessage());   }
System.out.println();    }
System.out.println("Quiz completed. Your score: " + score + "/" + questions.length);
scanner.close();    }  }











