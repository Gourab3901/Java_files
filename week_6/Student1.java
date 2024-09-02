/*Program to implement the Multiple Inheritance (Exam Interface, Student & Result classes).
*/

interface Exam {
	void display();}

class Result implements Exam{
	int marks;
	char grade;
	public Result(int marks,char grade){
		this.grade=grade;
		this.marks=marks;	}
	public void display(){
		System.out.println("Marks: "+this.marks+"\ngrade: "+grade);	}}
class Student1 extends Result{
	String name;
	int roll;
	public Student1(String name, int roll,int marks,char grade){
		super(marks,grade);
		this.name=name;
		this.roll=roll;	}
	public static void main(String[] args){
		Student1 s=new Student1("Gourab",39,85,'A');
		System.out.println("Name: "+s.name+"\nRoll: "+s.roll);
		s.display();	}}









