/*Write a program to define a class Student with four data members such as name, roll no., sub1, and sub2. 
Define appropriate methods to initialize and display the values of data members. 
Also calculate total marks and percentage scored by student. */

public class Student {
private String name;
private int roll;
private double sub1;
private double sub2;
public Student(String name, int roll, double sub1, double sub2) {
this.name = name;
this.roll = roll;
this.sub1 = sub1;
this.sub2 = sub2; }
public void displayStudentDetails() {
System.out.println("Student Details:");
System.out.println("Name: " + name);
System.out.println("Roll Number: " + roll);
System.out.println("Subject 1 Marks: " + sub1);
System.out.println("Subject 2 Marks: " + sub2); }
public void calculateAndDisplayResult() {
double totalMarks = sub1 + sub2;
double percentage = (totalMarks / 200) * 100;
System.out.println("Total Marks: " + totalMarks);
System.out.println("Percentage: " + percentage + "%"); }
public static void main(String[] args) {
Student student2 = new Student("Gourab", 39, 90, 82.0);
student2.displayStudentDetails();
student2.calculateAndDisplayResult(); } }
