package com.oops.practice_problems.vehicle_rental_system;

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    //constructor to initialize
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    //override to calculate rental cost
    @Override
    public double calculateRentalCost(int days) {
        // Additional $50 per day for maintenance
        return days * getRentalRate() + (days * 50);
    }
    //override to calculate insurance
    @Override
    public double calculateInsurance() {
        // 8% of the rental rate as insurance
        return getRentalRate() * 0.08;
    }
    //overriding to get insurance details
    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + insurancePolicyNumber;
    }
}