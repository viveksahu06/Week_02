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

import java.util.ArrayList;
import java.util.List;

public class ECommercePlatform {
    public static void calculateFinalPrice(List<Product> products){

        for(Product product : products){
            product.displayDetails();

            double discount = product.calculateDiscount();
            double tax=0;
            if(product instanceof  Taxable){
                tax = ((Taxable)product).calculateTax();
            }


            double finalPrice = product.getPrice() + tax -discount;

            System.out.println("Discount: $"+discount);
            System.out.println("Tax: $"+tax);
            System.out.println("Final Price: $"+ finalPrice);

            if(product instanceof  Taxable){
                System.out.println(((Taxable)product).getTaxDetails());
            }

            System.out.println("********************************************");

        }
    }
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Electronics(101,"Mobile", 1000));

        products.add(new Clothing(1,"Shirt", 1200));

        products.add(new Groceries(201,"Bread",20));

        calculateFinalPrice(products);

    }
}
