//Online Food Delivery System
//Description: Create an online food delivery system:
//Define an abstract class FoodItem with fields like itemName, price, and quantity.
//Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
//Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
//Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
//Demonstrate encapsulation to restrict modifications to order details and use polymorphism to handle different types of food items in a single order-processing method.

package com.oops.practice_problems.food_delivery_system;

import java.util.ArrayList;
import java.util.List;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Chole Kulche", 200, 2));
        order.add(new NonVegItem("Chicken Curry", 300, 1));
        order.add(new VegItem("Dosa", 70, 3));
        order.add(new NonVegItem("Mutton", 400, 2));

        // Process the order and apply discounts
        double discountRate = 0.20; // 20% discount
        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                discountable.applyDiscount(discountRate);
                System.out.println(discountable.getDiscountDetails());
            }

            System.out.println("********************************************************************");
        }
    }
}
