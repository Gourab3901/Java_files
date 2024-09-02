/*Create a class called Complex, which has three private instance variables –real and imaginary. It contains a method called add( ) which takes one Complex object as parameter and print the added value of the calling Complex object and passes Complex object. 
In the main method, declare two Complex objects and assign values using constructor and call the add() method.  */

public class Complex {
private double real;
private double imaginary;
public Complex(double real, double imaginary) {
this.real = real;
this.imaginary = imaginary; }
public void add(Complex other) {
double resultReal = this.real + other.real;
double resultImaginary = this.imaginary + other.imaginary;
System.out.println("Sum: " + resultReal + " + " + resultImaginary + "i"); }
public static void main(String[] args) {
Complex complex1 = new Complex(2.5, 3.0);
Complex complex2 = new Complex(1.5, 2.0);
complex1.add(complex2); } }
