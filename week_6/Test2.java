/*Write a program in Java to illustrate the use of interface in Java.  */

public interface Shape1 {
	double area();
double perimeter(); }

class Rectangle implements Shape1 {
private double length;
private double width;

public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;    }
public double area() {
return length * width;    }
public double perimeter() {
return 2 * (length + width);    }}
public class Test2 {
		public static void main(String[] args) {
	        Shape1 rectangle = new Rectangle(5, 4);
	System.out.println("Rectangle Area: " + rectangle.area());
	System.out.println("Rectangle Perimeter: " + rectangle.perimeter());   } }



