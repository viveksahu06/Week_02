/*Create a Book class with attributes title, author, and price. 
Provide both default and parameterized constructors*/ 
class Book{
    String title; 
    String author; 
    double price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }


    //parameterized constructer 
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

     // Method to display book details
     public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println();
    }

    
    
}
public class BookDetails{
    public static void main(String[] args) {
        //making default book to reference nothing
        Book defaultBook = new Book(); 
        defaultBook.displayDetails(); 
        //book 1 to store data
        Book book1 = new Book("programming using java", "R. N. Sons", 1122);
        
        //display the book details
        book1.displayDetails();
    }
}