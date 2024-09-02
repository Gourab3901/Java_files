/*Program to demonstrate use of hierarchical inheritance using interface.
*/

interface Animal {
	void sound();}

interface Mammal extends Animal{
	void giveBirth();}

interface Bird extends Animal{
	void layEggs();}

class Dog implements Mammal{
	public void sound() {
System.out.println("Dog barks");    }
public void giveBirth() {
System.out.println("Dog gives birth to puppies");    }}

class Cat implements Mammal{
	public void sound() {
System.out.println("Cat Mewoos");    }
public void giveBirth() {
System.out.println("Cat gives birth to kittens");    }}

class Parrot implements Bird{
	public void sound() {
System.out.println("Parrot talks");    }
public void layEggs() {
System.out.println("Parrot lays eggs in the nest");    }}

class Owl implements Bird{
	public void sound() {
System.out.println("Owl hooks");    }
public void layEggs() {
System.out.println("Owl lays eggs in the nest");    }}

public class Test13 {
public static void main(String args[]) {
Dog d=new Dog();
Cat c=new Cat();
Parrot p=new Parrot();
Owl o=new Owl();
d.sound();
d.giveBirth();
c.sound();
c.giveBirth();
p.sound();
p.layEggs();
o.sound();
o.layEggs();}}









