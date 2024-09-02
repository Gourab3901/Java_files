/*Create a base class Distance which stores the distance between two locations in miles and a method travelTime(). 
The method prints the time taken to cover the distance when the speed is 60 miles per hour. 
Now in a derived class DistanceMKS, override travelTime() so that it prints the time assuming the distance is in kilometers and the speed is 100 km per second. 
Demonstrate the working of the classes.    */

import java.util.Scanner;
class Distance {
protected double distanceInMiles;
public Distance(double distanceInMiles) {
this.distanceInMiles = distanceInMiles; }
public void travelTime() {
double timeInHours = distanceInMiles / 60.0; // Speed is 60 miles per hour
System.out.println("Time taken to cover the distance: " + timeInHours + " hours"); } }
class DistanceMKS extends Distance {
public DistanceMKS(double distanceInMiles) {
super(distanceInMiles); }
@Override
public void travelTime() {
double distanceInKilometers = distanceInMiles * 1.60934; // Conversion from miles to kilometers
double timeInSeconds = distanceInKilometers / 100.0; // Speed is 100 kilometers per hour
System.out.println("Time taken to cover the distance: " + timeInSeconds + " seconds"); } }
public class distance_miles {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.print("Enter the distance between two locations in miles: ");
double distanceInMiles = sc.nextDouble();
Distance distance = new Distance(distanceInMiles);
DistanceMKS distanceMKS = new DistanceMKS(distanceInMiles);
System.out.println("\nTravel time assuming speed is 60 miles per hour:");
distance.travelTime();
System.out.println("\nTravel time assuming speed is 100 km per hour:");
distanceMKS.travelTime();
sc.close(); } }
