/*Consider a Library Management System, where a user wants to find a book. If the book is present in Library (Hint: Use predefined array), then it will print the book. 
Otherwise it will throw an exception “BookNotFoundException”.  
 */

import java.util.Scanner;
class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);    }  }
public class LibraryManagementSystem {
    private static String[] books = {"The Alchemist", "The Da Vinci Code", "Harry Potter", "Moby Dick", "Pride and Prejudice"};
    public static void findBook(String bookName) throws BookNotFoundException {
        for (String book : books) {
            if (book.equalsIgnoreCase(bookName)) {
System.out.println("Book found: " + book);
return;     }     }
        throw new BookNotFoundException("BookNotFoundException: The book '" + bookName + "' is not found in our library.");   }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.println("Enter the name of the book you are searching for:");
        String bookName = scanner.nextLine();
        try {
findBook(bookName);
        } catch (BookNotFoundException e) {
System.out.println(e.getMessage());     }
scanner.close();    }  }










