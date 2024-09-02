/*Implement the following diagram.
*/

interface Exam2 {
	void percentCal();}

class Student2 {
	String name;
	int roll,marks1, marks2;
	Student2(String name,int roll,int marks1,int marks2){
		this.name = name;
		this.roll = roll;
		this.marks1 = marks1;
		this.marks2 = marks2;	}	
	public void show(){
		System.out.println("Name: "+this.name+"\troll: "+this.roll+"\tmarks1: "+this.marks1+"\tmarks2: "+this.marks2);}}

class Result2 extends Student2 implements Exam2{	
	double per;
	Result2(String name, int roll, int marks1, int marks2) {
		super(name, roll, marks1, marks2);	}
	public void percentCal(){
		this.per=(this.marks1+this.marks2)/2;	}
	public void percentDisplay(){
		this.percentCal();
		System.out.println("Percentage got by "+this.name+" is: "+this.per);	}
	public static void main(String[] args){
		Result2 r1=new Result2("Ava Paul",54, 93,85);
		Result2 r2=new Result2("Gourab Nandi",39, 86,95);
		r1.show();
		r1.percentDisplay();
		r2.show();
		r2.percentDisplay();	}}









