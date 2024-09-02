/* Create an interface called Player. 
The interface has an abstract method called play() that displays a message describing the meaning of “play” to the class. Create classes
called Child, Musician, and Actor that all implement Player. Create an application that demonstrates the use of the classes(UsePlayer.java)
*/

interface Player {
	void play();}
class Child implements Player{
	public void play() {
System.out.println("Child class");    }}
class Musician implements Player{
	public void play() {
System.out.println("Musician class");    }}
class Actor implements Player {
	public void play() {
System.out.println("Actor class");    }}
class usePlayer {
	public static void main(String[] args) {
	        Child child = new Child();
	        Musician musician = new Musician();
	        Actor actor = new Actor();
	System.out.println("Child:");
	child.play();
	System.out.println("\nMusician:");
	musician.play();
	System.out.println("\nActor:");
	actor.play();	    }}







