package com.oops.practice_problems.ecommerceplatform;

public class Clothing extends Product implements Taxable {
    private static final double CLOTHING_TAX_RATE = 0.05;
    private static final double CLOTHING_DISCOUNT = 0.20;

    // Constructor
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Implement calculateDiscount()
    @Override
    public double calculateDiscount() {
        return getPrice() * CLOTHING_DISCOUNT;
    }

    // Implement Taxable methods
    @Override
    public double calculateTax() {
        return getPrice() * CLOTHING_TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax Rate: " + (CLOTHING_TAX_RATE * 100) + "%";
    }
}
