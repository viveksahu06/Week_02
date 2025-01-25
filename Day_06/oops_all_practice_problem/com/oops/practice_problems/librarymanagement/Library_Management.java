
/*Description: Develop a library management system:
Use an abstract class LibraryItem with fields like itemId, title, and author.
Add an abstract method getLoanDuration() and a concrete method getItemDetails().
Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
Implement an interface Reservable with methods reserveItem() and checkAvailability().
Apply encapsulation to secure details like the borrower’s personal data.
Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.
*/
package com.oops.practice_problems.librarymanagement;
// main class
public class Library_Management {
    public static void main(String[] args) {
        // creating object of each class with referance of abstract class
        LibraryItem book = new Book(1,"Let us c ","Yashvant katenkar");
        LibraryItem magazine = new Magazine(2," Times of India","Pratham Raj");
        LibraryItem dvd = new DVD(3,"Blue ray","Vivek");


        // array for story object of class
        LibraryItem [] library = {book,magazine,dvd};

        // for loop used for iterating over object
        for(LibraryItem libraryItem : library){
            libraryItem.getItemDetails();
            // checking whether a object implements the Reservable interface or not
            if(libraryItem instanceof Reservable){
                Reservable reservable= (Reservable) libraryItem;
                System.out.println("Available : "+reservable.checkAvailability());
                reservable.reserveItem("Vivek");
                System.out.println("Available after reservation : "+reservable.checkAvailability());
            }
            System.out.println("***************************************************");
        }
    }
}
