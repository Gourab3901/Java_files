/*Write a program to define a class Item containing code and price. Accept this data for five objects using array of objects. 
Display code, price in tabular form and also, display total price of all items.   */

import java.util.Scanner;
class Item {
int code;
double price;
public Item(int code, double price) {
this.code = code;
this.price = price; } }
public class ItemDemo {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Item[] items = new Item[5];
for (int i = 0; i < items.length; i++) {
System.out.println("Enter details for Item " + (i + 1) + ":");
System.out.print("Enter code: ");
int code = scanner.nextInt();
System.out.print("Enter price: ");
double price = scanner.nextDouble();
items[i] = new Item(code, price); }
System.out.println("\nItem Details:");
System.out.printf("%-10s%-10s\n", "Code", "Price");
for (Item item : items) {
System.out.printf("%-10d%-10.2f\n", item.code, item.price); }
double totalPrice = 0;
for (Item item : items) {
totalPrice += item.price; }
System.out.println("\nTotal Price: " + totalPrice); } }

