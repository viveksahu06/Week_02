package com.oops.practice_problems.ecommerceplatform;

public class Electronics extends Product implements Taxable {
    private static final double ELECTRONICS_TAX_RATE = 0.05;
    private static final double ELECTRONICS_DISCOUNT = 0.20;

    // Constructor
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Implement calculateDiscount()
    @Override
    public double calculateDiscount() {
        return getPrice() * ELECTRONICS_DISCOUNT;
    }

    // Implement Taxable methods
    @Override
    public double calculateTax() {
        return getPrice() * ELECTRONICS_TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax Rate: " + (ELECTRONICS_TAX_RATE * 100) + "%";
    }
}
