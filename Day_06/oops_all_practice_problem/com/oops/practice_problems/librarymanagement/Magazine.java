package com.oops.practice_problems.librarymanagement;
public class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable;
  //constructor
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }
    // overriding the  method of abstract class
    @Override
    public int getLoanDuration() {
        return 7; // Magazines can be borrowed for 7 days
    }
    // overriding the method of interface
    @Override
    public void reserveItem(String browPersonName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The person reserved Magazine : " + browPersonName);
        } else {
            System.out.println("Magazine is currently unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
