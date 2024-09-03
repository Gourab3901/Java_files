/*Consider an Employee recruitment system that prints the candidate name based on the age criteria. 
The name and age of the candidate are taken as Input.Create two user-defined exceptions named “TooOlder” and “TooYounger” 
• If age>45, throw exception “TooOlder”. 
• If age<20, throw exception “TooYounger”. 
• Otherwise, print “Eligible” and print the name of the candidate.  
 */

import java.util.Scanner;
class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);    }  }
class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);    }  }
public class EmployeeRecruitmentSystem {
    public static void checkEligibility(String name, int age) throws TooOlder, TooYounger {
        if (age > 45) {
            throw new TooOlder("Candidate " + name + " is too old for recruitment.");
        } else if (age < 20) {
            throw new TooYounger("Candidate " + name + " is too young for recruitment.");
        } else {
System.out.println("Candidate " + name + " is eligible for recruitment.");    }    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
System.out.print("Enter candidate's name: ");
            String name = scanner.nextLine();
System.out.print("Enter candidate's age: ");
            int age = scanner.nextInt();
checkEligibility(name, age);
        } catch (TooOlder e) {
System.out.println(e.getMessage());
        } catch (TooYounger e) {
System.out.println(e.getMessage());
        } finally {
scanner.close();  }    }  }







