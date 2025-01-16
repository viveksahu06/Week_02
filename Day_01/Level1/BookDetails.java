/*
Program to Handle Book Details
Problem Statement: Write a program to create a Book class with attributes title,
 author, and price.
 Add a method to display the book details.*/
class Book{
	//attributes of books
	String title; 
	String author; 
	double price; 

	//constructer to store details 
	Book(String title, String author, double price){
		this.author= author; 
		this.title = title; 
		this.price = price;
	} 

	//Display details of the book 
	void display(){
		System.out.println("Title is: "+ title + ", Author is: "+ author + ", Price is: "+ price);
	}
 }
 public class BookDetails{ 
	public static void main(String []args){
		//obj to store book detail
		Book b1= new Book("Programming using java" , "K. N. Roy", 256); 
		//calling method to display book details
		b1.display();
	}
 }