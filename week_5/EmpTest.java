/*Write a program to define a class 'employee' with data members as empid, name and salary. 
Accept data for 5 objects using Array of objects and print it.   */

import java.util.Scanner;
class Emp {
int empid;
String name;
double salary;
Emp(int empid, String name, double salary) {
this.empid = empid;
this.name = name;
this.salary = salary; }
void display() {
System.out.println("Employee ID: " + empid);
System.out.println("Name: " + name);
System.out.println("Salary: $" + salary);
System.out.println(); } }
public class EmpTest {
public static void main(String[] args) {
Emp[] employees = new Emp[5];
Scanner scanner = new Scanner(System.in);
for (int i = 0; i < 5; i++) {
System.out.println("Enter details for Employee " + (i + 1) + ":");
System.out.print("Employee ID: ");
int empid = scanner.nextInt(); scanner.nextLine();
System.out.print("Name: ");
String name = scanner.nextLine();
System.out.print("Salary: ");
double salary = scanner.nextDouble();
employees[i] = new Emp(empid, name, salary); }
System.out.println("\nEmployee Information:");
for (Emp emp : employees) {
emp.display(); }
scanner.close(); } }
