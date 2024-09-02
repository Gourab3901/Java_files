/*Create a base class called “vehicle” that stores number of wheels and speed. 
Create the following derived classes – “car” that inherits “vehicle” and also stores number of passengers. 
“truck” that inherits “vehicle” and also stores the load limit. 
Write a main function to create objects of these two derived classes and display all 
the information about “car” and “truck”. Also compare the speed of these two 
vehicles - car and truck and display which one is faster.   */

import java.util.Scanner;
class Vehicle {
protected int Wheels;
protected double speed;
public Vehicle(int Wheels, double speed) {
this.Wheels = Wheels;
this.speed = speed; }
public double getSpeed() {
return speed; } 
public void displayInfo() {
System.out.println("Number of Wheels: " + Wheels);
System.out.println("Speed: " + speed + " mph"); } }
class Car extends Vehicle {
private int Passengers;
public Car(int Wheels, double speed, int Passengers) {
super(Wheels, speed);
this.Passengers = Passengers; }
@Override
public void displayInfo() {
super.displayInfo();
System.out.println("Number of Passengers: " + Passengers); } }
class Truck extends Vehicle {
private double loadLimit;
public Truck(int Wheels, double speed, double loadLimit) {
super(Wheels, speed);
this.loadLimit = loadLimit; }
@Override
public void displayInfo() {
super.displayInfo();
System.out.println("Load Limit: " + loadLimit + " tons"); } }
public class vehicle_car_truck {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter details for Car:");
System.out.print("Number of Wheels: ");
int carWheels = sc.nextInt();
System.out.print("Speed (mph): ");
double carSpeed = sc.nextDouble();
System.out.print("Number of Passengers: ");
int passengers = sc.nextInt();
// Input for Truck
System.out.println("\nEnter details for Truck:");
System.out.print("Number of Wheels: ");
int truckWheels = sc.nextInt();
System.out.print("Speed (mph): ");
double truckSpeed = sc.nextDouble();
System.out.print("Load Limit (tons): ");
double loadLimit = sc.nextDouble();
Car c = new Car(carWheels, carSpeed, passengers);
Truck t = new Truck(truckWheels, truckSpeed, loadLimit);
System.out.println("\nInformation about Car:");
c.displayInfo();
System.out.println("\nInformation about Truck:");
t.displayInfo();
if (c.getSpeed() > t.getSpeed()) {
System.out.println("\nCar is faster than Truck.");
} else if (c.getSpeed() < t.getSpeed()) {
System.out.println("\nTruck is faster than Car.");
} else {
System.out.println("\nCar and Truck have the same speed."); }
sc.close(); } }
