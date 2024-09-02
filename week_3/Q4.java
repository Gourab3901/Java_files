/* i. Write a Java program to calculate Sum of two 2-dimensional arrays. 
ii. Write a Java program to find the sum of diagonal elements in a 2D array. 
iii. Write Java program to find the sum of all odd numbers in a 2D array. 
iv. Write a Java program to print transpose of matrix. 
v. Write a Java program to check whether a given matrix is sparse or not. 
vi. Write a Java program to multiply two matrices. 
vii.  Write a Java program to subtract two matrices. */

public class Q4{
//q4
public static int[][] calculateSum(int[][] array1, int[][] array2) {
int rows = array1.length;
int cols = array1[0].length;
int[][] sumArray = new int[rows][cols];
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
sumArray[i][j] = array1[i][j] + array2[i][j]; } }
return sumArray; }
//q8
public static int diagonalSum(int[][] matrix) {
int sum = 0;
int rows = matrix.length;
int cols = matrix[0].length;
if (rows == cols) {
for (int i = 0; i < rows; i++) {
sum += matrix[i][i]; }
} else { System.out.println("The matrix is not square."); }
return sum; }
//q11
public static int sumOfOddElm(int[][] matrix) {
int sum=0;
int rows = matrix.length;
int cols = matrix[0].length;
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
if(matrix[i][j]%2!=0) {
sum+=matrix[i][j]; } } }
return sum; }
//q12
public static int[][] transposeMatrix(int[][] matrix) {
int rows = matrix.length;
int cols = matrix[0].length;
int[][] transpose = new int[cols][rows];
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
transpose[j][i] = matrix[i][j]; } }
return transpose; }
//q13
public static boolean isSparseMatrix(int[][] matrix) {
int totalElements = matrix.length * matrix[0].length;
int zeroCount = 0;
for (int[] row : matrix) {
for (int element : row) {
if (element == 0) {
zeroCount++; } } }
// Set a threshold for sparsity (e.g., 60% of elements being zero)
double sparsityThreshold = 0.6;
double sparsity = (double) zeroCount / totalElements;
return sparsity > sparsityThreshold; }
//q19
public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
int rows = mat1.length;
int cols = mat2[0].length;
int[][] result = new int[rows][cols];
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
for (int k = 0; k < mat1[0].length; k++) {
result[i][j] += mat1[i][k] * mat2[k][j]; } } }
return result; }
//q20
public static int[][] subtractMatrices(int[][] mat1, int[][] mat2) {
int rows = mat1.length;
int cols = mat1[0].length;
int[][] result = new int[rows][cols];
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
result[i][j] = mat1[i][j] - mat2[i][j]; } } 
return result; }
public static void displayArray(int[][] array) {
for (int[] row : array) {
for (int element : row) {
System.out.print(element + " "); }
System.out.println(); } }
public static void main(String[] args) {
int[][] array1 = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9} };
int[][] array2 = {
{9, 8, 7},
{6, 5, 4},
{3, 2, 1} };
int[][] sumArray = calculateSum(array1, array2);
System.out.println("Array 1:");
displayArray(array1);
System.out.println("\nArray 2:");
displayArray(array2);
System.out.println("\nSum Array:");
displayArray(sumArray);
System.out.println("Sum of diagonal elements: " + diagonalSum(array1));
System.out.println("Sum of Odd elements: " + sumOfOddElm(array1));
System.out.println("Original Matrix:");
displayArray(array1);
int[][] transpose = transposeMatrix(array1);
System.out.println("Transposed Matrix:");
displayArray(transpose);
if (isSparseMatrix(array1)) {
System.out.println("The matrix is sparse.");
} else {
System.out.println("The matrix is not sparse."); }
int[][] product = multiplyMatrices(array1, array2);
int[][] difference = subtractMatrices(array1, array2);
System.out.println("Matrix 1:");
displayArray(array1);
System.out.println("Matrix 2:");
displayArray(array2);
System.out.println("Matrix Multiplication Result:");
displayArray(product);
System.out.println("Matrix Subtraction Result:");
displayArray(difference); } }

