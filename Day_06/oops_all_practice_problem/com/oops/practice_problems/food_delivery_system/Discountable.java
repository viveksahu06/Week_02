package com.oops.practice_problems.food_delivery_system;

public interface Discountable {
    // Apply discount on total price
    void applyDiscount(double discountRate);

    // Get discount-related information
    String getDiscountDetails();
}
