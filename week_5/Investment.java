/* Write a test program that prompts the user to enter the investment amount (e.g., 1000) and the interest rate (e.g., 9%), and print a table that displays future value for the years from 1 to 30, as shown below: 
The amount invested: 1000 
Annual interest rate: 9% 
Years Future Value 
1 1093.8 
2 1196.41 
... 
30 14730.57*/

import java.util.Scanner;
public class Investment{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the investment amount: ");
double investmentAmount = scanner.nextDouble();
System.out.print("Enter the annual interest rate (in percentage): ");
double annualInterestRate = scanner.nextDouble();
annualInterestRate /= 100;
System.out.println("Years\tFuture Value");
for (int years = 1; years <= 30; years++) {
double futureValue = calculateFutureValue(investmentAmount, annualInterestRate, years);
System.out.printf("%d\t%.2f\n", years, futureValue); }
scanner.close(); }
private static double calculateFutureValue(double investmentAmount, double annualInterestRate, int years) {
return investmentAmount * Math.pow(1 + annualInterestRate, years); } }

