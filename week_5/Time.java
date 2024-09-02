/*Create a class called Time, which has three private instance variables – hour, min and sec. It contains a method called add( ) which takes one Time object as parameter and print the added value of the calling Time object and passes Time object. 
In the main method, declare two Time objects and assign values using constructor and call the add() method. */

public class Time {
private int hr;
private int min;
private int sec;
public Time(int hr, int min, int sec) {
this.hr = hr;
this.min = min;
this.sec = sec; }
public void add(Time otherTime) {
int totalSec = this.sec + otherTime.sec;
int carrySec = totalSec / 60;
this.sec = totalSec % 60;
int totalMin = this.min + otherTime.min + carrySec;
int carryMin = totalMin / 60;
this.min = totalMin % 60;
this.hr = this.hr + otherTime.hr + carryMin;
System.out.println("Added Time: " + this.hr + " hours, " + this.min + " minutes, " + this.sec + " seconds"); }
public static void main(String[] args) {
Time time1 = new Time(5, 30, 45);
Time time2 = new Time(2, 15, 20);
time1.add(time2); } }
