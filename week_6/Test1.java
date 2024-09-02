/*Design an abstract class having two methods. 
Create Rectangle and Triangle classes by inheriting the shape class and override the above methods to suitably implement for Rectangle and Triangle class.  */

abstract class shape {
	abstract double area();
abstract double perimeter(); }

class Rectangle extends shape{
private double length;
private double width;
public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;  }
double area() {
return length * width;    }
double perimeter() {
return 2 * (length + width);    }}

class Triangle extends shape{
private double side1;
private double side2;
private double side3;
public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;    }
double area() {
	double s=(side1+side2+side3)/2;
	return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));    }
double perimeter() {
return(side1 + side2 + side3);    }}

public class Test1 {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10, 15);
System.out.println("Rectangle Area: " + rectangle.area());
System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        Triangle triangle = new Triangle(3, 4, 5);
System.out.println("Triangle Area: " + triangle.area());
System.out.println("Triangle Perimeter: " + triangle.perimeter());	}}



