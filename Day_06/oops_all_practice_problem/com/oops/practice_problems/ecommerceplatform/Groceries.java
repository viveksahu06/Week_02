package com.oops.practice_problems.ecommerceplatform;

public class Groceries extends Product implements Taxable{
    private static final double GROCERIES_TAX_RATE = 0.15;
    private static final double GROCERIES_DISCOUNT = 0.10;
    //constructor to initialize
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);

    }

    // Implement calculateDiscount()
    @Override
    public double calculateDiscount() {
        return getPrice() * GROCERIES_DISCOUNT;
    }
    // Implement Taxable methods
    @Override
    public double calculateTax() {
        return getPrice()* GROCERIES_TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Groceries Tax Rate: "+(GROCERIES_TAX_RATE*100)+"%";
    }
}
