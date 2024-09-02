/*Create three interfaces, each with two methods. 
Inherit a new interface from the three, adding a new method. 
Create a class by implementing the new interface and also inheriting from a concrete class. 
Now write four methods, each of which takes one of the four interfaces as an argument. In main ( ), create an object of your class and pass it to each of the methods.
 */

interface I1 {
	void method1();
void method2();}
interface I2 {
	void method3();
void method4();}
interface I3 {
	void method5();
void method6();}
interface NewI extends I1,I2,I3{
	void newMethod();}
class ConcreteClass {
	void concreteMethod() {
System.out.println("This is a concrete method.");    }}
class MyClass extends ConcreteClass implements NewI{
	public void method1() {
System.out.println("Method 1");    }
public void method2() {
System.out.println("Method 2");    }
public void method3() {
System.out.println("Method 3");    }
public void method4() {
System.out.println("Method 4");    }
public void method5() {
System.out.println("Method 5");    }
public void method6() {
System.out.println("Method 6");    }
public void newMethod() {
System.out.println("New Method");    }}
public class Test5{
	static void methodWithInterface1(I1 obj) {
obj.method1();
obj.method2();    }
static void methodWithInterface2(I2 obj) {
obj.method3();
obj.method4();    }
static void methodWithInterface3(I3 obj) {
obj.method5();
obj.method6();    }
static void methodWithNewInterface(NewI obj) {
obj.method1();
obj.method2();
obj.method3();
obj.method4();
obj.method5();
obj.method6();
obj.newMethod();    }
public static void main(String[] args) {
        MyClass myObj = new MyClass();
System.out.println("Passing to methodWithInterface1:");
methodWithInterface1(myObj);
System.out.println("\nPassing to method With Interface2:");
methodWithInterface2(myObj);
System.out.println("\nPassing to method With Interface3:");
methodWithInterface3(myObj);
System.out.println("\nPassing to method With NewInterface:");
methodWithNewInterface(myObj);    }}





