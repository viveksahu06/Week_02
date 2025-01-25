package com.oops.practice_problems.food_delivery_system;

public class VegItem extends FoodItem implements Discountable{
    private double totalPrice;
    private double discount;
    //constructor to initialize
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.totalPrice = calculateTotalPrice();
    }

    //overriding to calculate total price
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
    //method to apply discount
    @Override
    public void applyDiscount(double discountRate) {
        discount = totalPrice * discountRate;
        totalPrice -= discount;
    }
    //overriding to get discount details
    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discount + ", Final Price: " + totalPrice;
    }
    //overriding to get item details
    @Override
    public String getItemDetails() {
        return super.getItemDetails() + ", Total Price: " + totalPrice;
    }
}
