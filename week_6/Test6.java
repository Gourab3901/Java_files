/*Create an interface Department containing attributes deptName and deptHead. It also has abstract methods for printing the attributes. 
Create a class hostel containing hostelName, hostelLocation and numberofRooms. 
The class contains methods for getting and printing the attributes. 
Then write Student class extending the Hostel class and implementing the Department interface. 
This class contains attributes studentName, regdNo, electiveSubject and avgMarks. 
Write suitable getData and printData methods for this class. Also implement the abstract methods of the Department interface. 
Write a driver class to test the Student class. The program should be menu driven containing the options:
i) Admit new student
ii) Migrate a student
iii) Display details of a student
For the third option a search is to be made on the basis of the entered registration number
*/

import java.util.Scanner;
interface Department {
	void printDeptDetails();}
class Hostel {
	private String hostelName;
private String hostelLocation;
private int numberOfRooms;
public Hostel(String hostelName, String hostelLocation, int numberOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms;    }
public String getHostelName() {
return hostelName;    }
public String getHostelLocation() {
return hostelLocation;    }
public int getNumberOfRooms() {
return numberOfRooms;    }
public void printHostelDetails() {
System.out.println("Hostel Name: " + hostelName);
System.out.println("Hostel Location: " + hostelLocation);
System.out.println("Number of Rooms: " + numberOfRooms);    }}

class Student extends Hostel implements Department{
	private String studentName;
private int regdNo;
private String electiveSubject;
private double avgMarks;
public Student(String hostelName, String hostelLocation, int numberOfRooms, String studentName, int regdNo, String electiveSubject, double avgMarks) {
super(hostelName, hostelLocation, numberOfRooms);
        this.studentName = studentName;
        this.regdNo = regdNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;    }
public String getStudentName() {
return studentName;    }
public int getRegdNo() {
return regdNo;    }
public String getElectiveSubject() {
return electiveSubject;    }
public double getAvgMarks() {
return avgMarks;    }
public void printStudentDetails() {
System.out.println("Student Name: " + studentName);
System.out.println("Registration Number: " + regdNo);
System.out.println("Elective Subject: " + electiveSubject);
System.out.println("Average Marks: " + avgMarks);
printHostelDetails();    }
public void printDeptDetails() {
System.out.println("Department: Computer Science");
System.out.println("Department Head: Dr. Smith");    }}

public class Test6 {
private static Student[] students = new Student[50];
private static int count = 0;
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int choice;
do {
System.out.println("\nMenu:");
System.out.println("1. Admit new student");
System.out.println("2. Migrate a student");
System.out.println("3. Display details of a student");
System.out.println("4. Exit");
System.out.print("Enter your choice: ");
choice = scanner.nextInt();
switch (choice) {
case 1:
admitNewStudent(scanner); break;
case 2:
System.out.println("................"); break;
case 3:
displayStudentDetails(scanner); break;
case 4:
System.out.println("Exiting program."); break;
default:
System.out.println("Invalid choice. Please try again.");            }        }
 while (choice != 4);
scanner.close();    }
private static void admitNewStudent(Scanner scanner) {
System.out.println("Enter student details:");
System.out.print("Student Name: ");
        String studentName = scanner.next();
System.out.print("Registration Number: ");
int regdNo = scanner.nextInt();
System.out.print("Elective Subject: ");
        String electiveSubject = scanner.next();
System.out.print("Average Marks: ");
double avgMarks = scanner.nextDouble();
System.out.print("Hostel Name: ");
        String hostelName = scanner.next();
System.out.print("Hostel Location: ");
        String hostelLocation = scanner.next();
System.out.print("Number of Rooms: ");
int numberOfRooms = scanner.nextInt();
students[count] = new Student(hostelName, hostelLocation, numberOfRooms, studentName, regdNo, electiveSubject, avgMarks);
count++;
System.out.println("Student admitted successfully.");    }
private static void displayStudentDetails(Scanner scanner) {
System.out.print("Enter registration number of the student: ");
int regdNo = scanner.nextInt();
        Student student = findStudentByRegdNo(regdNo);
if (student != null) {
student.printStudentDetails();
student.printDeptDetails();       } else {
System.out.println("Student not found with registration number " + regdNo);        }    }
private static Student findStudentByRegdNo(int regdNo) {
for (int i = 0; i < count; i++) {
if (students[i].getRegdNo() == regdNo) {
return students[i];            }        }
return null;    }}






