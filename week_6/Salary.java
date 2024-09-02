/*a program to implement the Multiple Inheritance (Gross Interface, Employee & Salary classes).
*/

interface Gross {
	double calculateGrossSalary();}

class Employee {
	protected String name;
protected int id;

public Employee(String name, int id) {
        this.name = name;
        this.id = id;    }

public void display() {
System.out.println("Employee ID: " + id);
System.out.println("Employee Name: " + name);    }}

class Salary extends Employee implements Gross{
	private double basicSalary;
private double allowances;

public Salary(String name, int id, double basicSalary, double allowances) {
super(name, id);
        this.basicSalary = basicSalary;
        this.allowances = allowances;    }

    @Override
public double calculateGrossSalary() {
return basicSalary + allowances;    }

public void displaySalaryDetails() {
display();
System.out.println("Basic Salary: " + basicSalary);
System.out.println("Allowances: " + allowances);
System.out.println("Gross Salary: " + calculateGrossSalary());    }
public static void main(String[] args) {
        Salary employee1 = new Salary("Gourab Nandi", 46612, 30000, 60);
employee1.displaySalaryDetails();    }}









