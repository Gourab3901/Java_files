/*Design a stack class. Provide your own stack exceptions namely push exception and pop exception, 
which throw exceptions when the stack is full and when the stack is empty respectively. 
Show the usage of these exceptions in handling a stack object in the main. 
 */

import java.util.Scanner;
class PushException extends Exception {
    public PushException(String message) {
        super(message);   }}
class PopException extends Exception {
    public PopException(String message) {
        super(message);   }}
class Stack {
    private int[] elements;
    private int top;
    private int capacity;
    public Stack(int size) {
        elements = new int[size];
        capacity = size;
        top = -1;   }
    public void push(int element) throws PushException {
        if (isFull()) {
            throw new PushException("Stack is full. Cannot push element.");   }
        elements[++top] = element;   }
    public int pop() throws PopException {
        if (isEmpty()) {
            throw new PopException("Stack is empty. Cannot pop element.");    }
        return elements[top--];   }
    public booleanisEmpty() {
        return top == -1;    }
    public booleanisFull() {
        return top == capacity - 1;    } }
public class StackDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        Stack stack = new Stack(size);
        try {
            for (int i = 0; i< size + 1; i++) {  
System.out.println("Pushing: " + i);
stack.push(i);    }
        } catch (PushException e) {
System.out.println(e.getMessage());   }
        try {
            for (int i = 0; i< size + 1; i++) { 
System.out.println("Popped: " + stack.pop());     }
        } catch (PopException e) {
System.out.println(e.getMessage());
        } finally {
scanner.close();}    }}
















