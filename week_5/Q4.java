/*Write a program to define a class having one 3-digit number, num as data member. Initialize and display reverse of that number.  */

public class Q4 {
int num;
public Q4(int num) {
this.num=num; }
public int getReverse() {
int demo=this.num;
int reverse_number=0;
while(demo>0) {
int remainder=demo%10;
reverse_number=reverse_number*10+remainder;
demo=demo/10; }
return reverse_number;
}
public static void main(String[] args) {
Q4 obj=new Q4(156);
System.out.println("reverse of "+obj.num+ " ->"+obj.getReverse()); } }
