package com.oops.practice_problems.librarymanagement;
// abstract class blueprint for LibraryItem
abstract class LibraryItem {
    int itemId;
    String tittle;
    String author;

    // Constructor
    public LibraryItem(int itemId, String tittle, String author) {
        this.itemId = itemId;
        this.tittle = tittle;
        this.author = author;
    }

    // Defining getter and setter


    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // abstract method who,s implementation will be given by extending class
    abstract int getLoanDuration();

    // method to display detail of Items
    void getItemDetails(){
        System.out.println("ItemId : "+itemId);
        System.out.println("Tittle  : "+tittle);
        System.out.println("Author : "+author);
    }

}
