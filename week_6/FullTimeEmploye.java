/*Java program to Perform Payroll Using Interface (Multiple Inheritance).
*/

interface Employee {
	double calculateSalary();}

interface Tax {
	double calculateTax();}

class FullTimeEmployee implements Employee, Tax{
	private String name;
private double salary;
private double taxRate;
public FullTimeEmployee(String name, double salary, double taxRate) {
        this.name = name;
        this.salary = salary;
        this.taxRate = taxRate;    }
public double calculateSalary() {
return salary;    }
public double calculateTax() {
return salary * (taxRate / 100);    }
public static void main(String[] args) {
        FullTimeEmployee employee = new FullTimeEmployee("Gourab Nandi", 30000, 10);
System.out.println("Employee Name: " + employee.name);
System.out.println("Salary: $" + employee.calculateSalary());
System.out.println("Tax: $" + employee.calculateTax());    }}









