/*Write a class, Grader, which has an instance variable, score, an appropriate constructor and appropriate methods. 
A method, letterGrade() that returns the letter grade as O/E/A/B/C/F.  
Now write a demo class to test the Grader class by reading a score from the user, using it to create a Grader object after validating that the value is not negative and is not greater then 100. 
Finally, call the letterGrade() method to get and print the grade. */

import  java.util.*;
class Grader {
int score;
Grader(int score){
this.score=score;}
public char letterGrade(int score) {
if(score>=90) { return 'A';}
else if(score>=80) { return 'B'; }
else if(score>=70) { return 'C'; }
else if(score>=60) { return 'E'; }
else if(score>=25 && score<=59) { return 'O'; }
return 'F';}}
public class Q6{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter your marks->");
int marks=sc.nextInt();
if(marks<0 || marks>100) {
System.out.println("Invalid marks..."); }
else { Grader gd=new Grader(marks);
System.out.println("your grade is->"+gd.letterGrade(marks)); } } }
