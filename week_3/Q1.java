/* i.Write a Java program to calculate Sum & Average of an integer array. 
ii. Write a Java program to search an element in an array. 
iii. Write a Java program to find the sum of even numbers in an integer array.
iv. Reverse the elements in an array of integers without using a second array. 
v. Write a Java program to enter n elements in an array and find smallest number among them. 
vi. Write a Java program to count the prime numbers in an array. 
vii. Write a Java program to find second highest element of an array. 
viii. Write a Java program which counts the non-zero elements in an integer array. 
ix. Write a Java program to merge two float arrays. 
x. Write a Java program where elements of two integer arrays get added index wise and get stored into a third array. 
xi. Write a Java program to find duplicate elements in a 1D array and find their frequency of occurrence. 
xii.Write a Java program to print every alternate number of a given array. 
xiii. Given are two one-dimensional arrays A & B, which are sorted in ascending order. Write a xiv. Java program to merge them into single sorted array C that contains every item from arrays A & B, in ascending order. */

import java.util.*;
public class Q1 {
//q6
public static void searchElement(int []arr,int elm) {
boolean flag=false;
for(int n:arr) {
if(n==elm) {
flag=true;
break; } }
if(flag) {
System.out.println("element found"); }
else {
System.out.println("element not found"); } }
//q7
public static int sumOfEvenNumbers(int []arr) {
int sum=0;
for(int n:arr) {
if(n%2==0) {
sum+=n; } }
return sum; }
//q9
public static void reverseArray(int[] arr) {
int start = 0;
int end = arr.length - 1;
while (start < end) {
int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp;
start++;
end--;
} }
public static void printArray(int[] arr) {
for (int element : arr) {
System.out.print(element + " "); }
System.out.println(); }
//q10
public static int getSmallestNumber(int[] arr) {
int small=arr[0];
for(int n:arr) {
if(small > n) {
small=n; } }
return small; }
//q14
public static int countPrimeNumbers(int[] arr) {
int count=0;
boolean flag;
for(int n:arr) {
flag=false;
for(int i=2;i<n/2;i++) {
if(n%i==0) {
flag=true;
break; }
else {
flag=false; } }
if(!flag) count++; }
return count; }
//q15
public static int findSecondHighest(int[] arr) {
int highest = Integer.MIN_VALUE;
int secondHighest = Integer.MIN_VALUE;
for (int num : arr) {
if (num > highest) {
secondHighest = highest;
highest = num;
} else if (num > secondHighest && num != highest) {
secondHighest = num; } }
return secondHighest;}
//q16
public static int findNonZeroElm(int []arr) {
int count=0;
for(int n:arr) {
if(n!=0) count++; }
return count; }
//q17
static float[] mergeArrays(float[] arr1, float[] arr2) {
int length1 = arr1.length;
int length2 = arr2.length;
float[] mergedArray = new float[length1 + length2];
System.arraycopy(arr1, 0, mergedArray, 0, length1);
System.arraycopy(arr2, 0, mergedArray, length1, length2);
return mergedArray; }
//q18
public static void AddAndSortArrays(int []array1,int []array2) {
if (array1.length != array2.length) {
System.out.println("Arrays must have the same length.");
return; }
int[] sumArray = new int[array1.length];
for (int i = 0; i < array1.length; i++) {
sumArray[i] = array1[i] + array2[i]; }
Arrays.sort(sumArray);
System.out.println("Array 1: " + Arrays.toString(array1));
System.out.println("Array 2: " + Arrays.toString(array2));
System.out.println("Sum Array: " + Arrays.toString(sumArray)); }
//q21
public static void DuplicateElementsFrequency(int []array) {
Map<Integer, Integer> frequencyMap = new HashMap<>();
for (int num : array) {
frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1); }
System.out.println("Duplicate Elements and their Frequencies:");
for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
if (entry.getValue() > 1) {
System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue()); } } }
//q22
public static void printAlternateNumbers(int []arr) {
for(int i=0;i<arr.length;i+=2) {
System.out.println(arr[i]); } }
//q23
public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
int len1 = arr1.length;
int len2 = arr2.length;
int[] mergedArray = new int[len1 + len2];
int i = 0, j = 0, k = 0;
while (i < len1 && j < len2) {
if (arr1[i] <= arr2[j]) {
mergedArray[k++] = arr1[i++];
} else {
mergedArray[k++] = arr2[j++]; } }
while (i < len1) { mergedArray[k++] = arr1[i++]; }
while (j < len2) { mergedArray[k++] = arr2[j++]; }
return mergedArray; }

public static void main(String[] args) {
int arr[]= {1,5,8,3,9};
int a[]= {1,5,8,3,9};
float[] array1 = {1.5f, 2.5f, 3.5f};
float[] array2 = {4.5f, 5.5f, 6.5f};
int sort_arr1[]= {1,2,3,8,15};
int sort_arr2[]= {6,45,100};
int avg,sum=0;	//q1
for(int n:arr) {
sum+=n; }
avg=sum/arr.length;
System.out.println("sum is->"+sum);
System.out.println("average is->"+avg);
int element=5;
searchElement(arr, element);
System.out.println("sum of even element is->"+sumOfEvenNumbers(arr));
System.out.println("Original Array: ");printArray(arr);
reverseArray(arr);
System.out.println("Reversed Array: ");
printArray(arr);
System.out.println("Smallest element is"+getSmallestNumber(arr));
System.out.println("no of prime no is->"+countPrimeNumbers(arr));
System.out.println("The second highest element is: " + findSecondHighest(arr));
System.out.println("no of non-zero elemnt is->"+findNonZeroElm(arr));
float[] mergedArray = mergeArrays(array1, array2);
System.out.println("Merged Array: " + Arrays.toString(mergedArray));
AddAndSortArrays(arr, a);
DuplicateElementsFrequency(a);
printAlternateNumbers(arr);
int[] mergedArr = mergeSortedArrays(sort_arr1, sort_arr2);
System.out.println("Merged Sorted Array:");
for (int num : mergedArr) {
System.out.print(num + " "); } } }
