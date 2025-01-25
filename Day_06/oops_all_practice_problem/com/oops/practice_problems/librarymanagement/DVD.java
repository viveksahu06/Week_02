package com.oops.practice_problems.librarymanagement;
public class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable;

    // constructor
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    // overriding the  method of abstract class
    @Override
    public int getLoanDuration() {
        // Dvd borrowed for 2 days
        return 2;
    }

    // overriding the method of interface
    @Override
    public void reserveItem(String browPersonName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The person reserved DVD: " + browPersonName);
        } else {
            System.out.println("DVD is currently unavailable.");
        }
    }
    // overriding the method of interface
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
