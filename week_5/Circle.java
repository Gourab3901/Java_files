/*Create a “circle” class & a “point” class. The coordinates of the circle are given and used within the “circle” class as object of the “point” class.
Display the area of circle. */

class Point {
private double x;
private double y;
public Point(double x, double y) {
this.x = x;
this.y = y; }
public double getX() {
return x; }
public double getY() {
return y; }
public double getDistance(Point obj) {
double distance = Math.sqrt(Math.pow(this.x - obj.x, 2) + Math.pow(this.y - obj.y, 2));
return distance; } }

public class Circle {
public Point point1;
public Point point2;
public double radius;
public Circle(Point point1,Point point2) {
this.point1 = point1;
this.point2 = point2;
this.radius=this.point1.getDistance(this.point2); }
public double calculateArea() {
return Math.PI * Math.pow(this.radius, 2); }
public void displayArea() {
System.out.println("Area of the circle: " + calculateArea()); }
public static void main(String[] args) {
Point point1 = new Point(2.0, 3.0);
Point point2 = new Point(8.0, 6.0);
Circle myCircle = new Circle(point1,point2);
myCircle.displayArea(); } }
