package com.oops.practice_problems.librarymanagement;

// Book class implementing details of LibraryItem
 class Book extends LibraryItem implements Reservable{

     // instance variable used for keeping trace whether item is available or niot
    private boolean isAvailable;
    //constructor
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }
    // overriding the  method of abstract class
    @Override
    int getLoanDuration(){
        // here it represent number of days
        return 7;
    }
    // overriding the method of interface
    @Override
    public void reserveItem(String browPersonName){
        if(isAvailable){
            isAvailable=false;
            System.out.println("The person reserved Book : "+browPersonName);
        }
        else{
            System.out.println("Magazine is currently unavailable");
        }
    }
    // overriding the method of interface
    @Override
    public boolean checkAvailability(){
        return isAvailable;
    }
}
