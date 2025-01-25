package com.oops.practice_problems.food_delivery_system;

class NonVegItem extends FoodItem implements Discountable {
    private double totalPrice;
    private double discount;
    // Additional charge for non-veg items
    private static final double NON_VEG_SURCHARGE = 50;

    //constructor to initialize
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.totalPrice = calculateTotalPrice();
    }
    //implementing FodItem and overriding them
    @Override
    public double calculateTotalPrice() {
        return (getPrice() + NON_VEG_SURCHARGE) * getQuantity();
    }
    //method to calculate and apply discount
    @Override
    public void applyDiscount(double discountRate) {
        discount = totalPrice * discountRate;
        totalPrice -= discount;
    }
    //method to get discount details
    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discount + ", Final Price: " + totalPrice;
    }
    //method to get item details
    @Override
    public String getItemDetails() {
        return super.getItemDetails() + ", Total Price (with surcharge): " + totalPrice;
    }
}

