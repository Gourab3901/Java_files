//Write a Java program to find median of a set of numbers. 

import java.util.*;
public class Q17{
public static void main(String[] args) {
int ch;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of elements: ");
int len=sc.nextInt();
int[] inputArray = new int[len];
System.out.println("Enter the elements: ");
for(int i=0; i < len; i++) {
inputArray[i]=sc.nextInt(); }
System.out.println("Median of given array "+ Arrays.toString(inputArray) + " is = " + median(inputArray, len)); }
public static double mean(int arr[], int len) {
int sum = 0;
for (int i = 0; i < len; i++)
sum += arr[i];
return (double)sum / (double)len; }
public static double median(int arr[], int len) {
Arrays.sort(arr);
if (len % 2 != 0){
return (double)arr[len / 2]; }
System.out.println(arr[(len - 1)]);
return (double)(arr[(len - 1) / 2] + arr[len / 2]) / 2.0; } }
















