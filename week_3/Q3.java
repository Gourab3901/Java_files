//Write a Java program to implement queue using array.  

import java.util.*;
public class Test {
private int maxSize;
private int[] queueArray;
private int front;
private int rear;
private int size;
public Test(int maxSize) {
this.maxSize = maxSize;
this.queueArray = new int[maxSize];
this.front = 0;
this.rear = -1;
this.size = 0; }
public boolean isEmpty() {
return size == 0; }
public boolean isFull() {
return size == maxSize; }
public int size() {
return size; }
public void enqueue(int data) {
if (isFull()) {
System.out.println("Queue is full. Cannot enqueue.");
} else { rear = (rear + 1) % maxSize;
queueArray[rear] = data;
size++;
System.out.println("Enqueued: " + data); } }
public int dequeue() {
if (isEmpty()) {
System.out.println("Queue is empty. Cannot dequeue.");
return -1;
} else {
int dequeued = queueArray[front];
front = (front + 1) % maxSize;
size--;
System.out.println("Dequeued: " + dequeued);
return dequeued; } }
public static void main(String[] args) {
Test queue = new Test(5);
queue.enqueue(1);
queue.enqueue(2);
queue.enqueue(3);
queue.dequeue();
System.out.println("Is queue empty? " + queue.isEmpty()); } }

