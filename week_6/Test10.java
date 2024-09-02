/*the below Diagram. Here AbstractProduct is only abstract class.
*/

abstract class AbstractProduct {
	protected String productId;
protected String name;
protected String description;
public AbstractProduct(String productId, String name, String description) {
        this.productId = productId;
        this.name = name;
        this.description = description;    }
abstract void displayDetails();}

class Book extends AbstractProduct{
	private String isbn;
private String author;
private String title;
public Book(String productId, String name, String description, String isbn, String author, String title) {
super(productId, name, description);
        this.isbn = isbn;
        this.author = author;
        this.title = title;    }
void displayDetails() {
System.out.println("Book Details:");
System.out.println("Product ID: " + productId);
System.out.println("Name: " + name);
System.out.println("Description: " + description);
System.out.println("ISBN: " + isbn);
System.out.println("Author: " + author);
System.out.println("Title: " + title);    }}

class TravelGuide extends Book{
	private String country;
	public TravelGuide(String productId, String name, String description, String isbn, String author, String title, String country) {
	super(productId, name, description, isbn, author, title);
	        this.country = country;	    }
	void displayDetails() {
	super.displayDetails();
	System.out.println("Country: " + country);	    }}

class Product extends AbstractProduct{
	private double price;
public Product(String productId, String name, String description, double price) {
super(productId, name, description);
        this.price = price;    }
void displayDetails() {
System.out.println("Product Details:");
System.out.println("Product ID: " + productId);
System.out.println("Name: " + name);
System.out.println("Description: " + description);
System.out.println("Price: " + price);    }}

class CompactDisc extends AbstractProduct{
	private String artist;
private String title;
public CompactDisc(String productId, String name, String description, String artist, String title) {
super(productId, name, description);
        this.artist = artist;
        this.title = title;    }
void displayDetails() {
System.out.println("Compact Disc Details:");
System.out.println("Product ID: " + productId);
System.out.println("Name: " + name);
System.out.println("Description: " + description);
System.out.println("Artist: " + artist);
System.out.println("Title: " + title);    }}

public class Test10 {
	public static void main(String[] args) {
        Book book = new Book("B001", "Book Title", "A great book", "978-3-16-148410-0", "Roy", "The Book");
        TravelGuide travelGuide = new TravelGuide("TG001", "Travel Guide", "A guide to traveling", "978-3-16-148411-0", "Rima", "The Travel Guide", "France");
        Product product = new Product("P001", "Product", "A generic product", 25.99);
        CompactDisc cd = new CompactDisc("CD001", "CD", "A music CD", "Artist Name", "CD Title");
book.displayDetails();
travelGuide.displayDetails();
product.displayDetails();
cd.displayDetails();    }}








