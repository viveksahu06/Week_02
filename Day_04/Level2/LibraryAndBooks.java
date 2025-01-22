/*
Problem 1: Library and Books (Aggregation)
Description: Create a Library class that contains multiple Book objects. Model the relationship such that a library can have many books, but a book can exist independently (outside of a specific library).
Tasks:
Define a Library class with an ArrayList of Book objects.
Define a Book class with attributes such as title and author.
Demonstrate the aggregation relationship by creating books and adding them to different libraries.
Goal: Understand aggregation by modeling a real-world relationship where the Library aggregates Book objects.*/

import java.util.ArrayList;

class Book{
    private String title; 
    private String author;

    //constructer to store details
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }  

    public String toString() {
        return "Book [Title: " + title + ", Author: " + author + "]";
    }  
  
}

class Library{
    ArrayList<Book> books;
    private String name;
    public Library( String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }
    
    public void addBook(Book book){
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in " + name + " Library:");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
    }
    
}
public class LibraryAndBooks{
    public static void main(String[] args) {
        Book book1 = new Book("Java", "Fin Lee");
        Book book2 = new Book("C++", "Yaswant");
        

         // Creating Library objects
         Library library1 = new Library("Central Library");
         Library library2 = new Library("Person Library");

         Book book3= new Book("Megistry","Paradox");
 
         // Adding books to libraries
         library1.addBook(book1);
         library1.addBook(book2);
 
         library2.addBook(book3);
         library2.addBook(book1); 
         library2.addBook(book2); 

         // Displaying books in each library
         library1.displayBooks();
         library2.displayBooks();

    }

}