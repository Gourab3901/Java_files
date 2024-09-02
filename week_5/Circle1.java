/*Define a class called circle that contains: 
• Two private instance variables: radius (of type double) and color (of type String), 
• Initialize the variables radius and color with default value of 1.0 and "red", respectively using default constructor. 
• Include a second constructor that will use the default value for color and sets the 
radius to the value passed as parameter. 
• Two public methods: getRadius() and getArea() for returning the radius and area of 
the circle 
• Invoke the above methods and constructors in the main.*/

public class Circle1{
private double radius;
private String color;
public Circle1(){
this.radius=1.0;
this.color="red"; }
public Circle1(double radius){
this.radius=radius;
this.color="red"; }
public double getRadius(){
return this.radius; }
public double getArea(){
return 3.14*this.radius*this.radius; }
public static void main(String[] args){
Circle1 c1=new Circle1();
Circle1 c2=new Circle1(10.4);
System.out.println("Radius of circle 1 is"+ c1.getRadius());
System.out.println("Area of circle 1 is"+ c1.getArea());
System.out.println("Radius of circle 2 is"+ c1.getRadius());
System.out.println("Area of circle 2 is"+ c1.getArea()); } }
