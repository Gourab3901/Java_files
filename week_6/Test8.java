/* Create an abstract class MotorVehicle with the following details:
Data Members:
(a) modelName (b)modelNumber (c) modelPrice
Methods:
(a) display() to show all the details
Create a subclass of this class Carthat inherits the class MotorVehicle and add the following details:
Data Members:
(b) discountRate
Methods:
(a) display() method to display the Car name, model number, price and the discount rate.
(b) discount() method to compute the discount.

*/

abstract class MotorVehicle {
	String modelName;
int modelNumber;
double modelPrice;
public MotorVehicle(String modelName, int modelNumber, double modelPrice) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;    }
void display() {
System.out.println("Model Name: " + modelName);
System.out.println("Model Number: " + modelNumber);
System.out.println("Model Price: " + modelPrice);    }}

class Car extends MotorVehicle {
	double discountRate;
public Car(String modelName, int modelNumber, double modelPrice, double discountRate) {
super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;    }
void display() {
super.display();
System.out.println("Discount Rate: " + discountRate);    }
void discount() {
double discountAmount = modelPrice * discountRate / 100;
double discountedPrice = modelPrice - discountAmount;
System.out.println("Discounted Price: " + discountedPrice);    }}

public class Test8 {
	public static void main(String[] args) {
        Car car = new Car("Toyota", 123, 25000, 10);
car.display();
car.discount();    }}






