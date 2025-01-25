//E-Commerce Platform
//Description: Develop a simplified e-commerce platform:
//Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
//Extend it into concrete classes: Electronics, Clothing, and Groceries.
//Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
//Use encapsulation to protect product details, allowing updates only through setter methods.
//Showcase polymorphism by creating a method that calculates and
// prints the final price (price + tax - discount) for a list of Product.
//
//
package com.oops.practice_problems.ecommerceplatform;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    //Constructor to initialize
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    //getter setter


    public int getProductId() {
        return productId;
    }

    public void setProducrId(int producrId) {
        this.productId = producrId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //abstract method to calculate discount
    public abstract double calculateDiscount();
    // Concrete method to display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}
