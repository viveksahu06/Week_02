package com.oops.practice_problems.vehicle_rental_system;

public class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    //constructor to initialize
    @Override
    public double calculateRentalCost(int days) {

        return days * getRentalRate();
    }

    // 3% of the rental rate as insurance
    @Override
    public double calculateInsurance() {

        return getRentalRate() * 0.03;
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + insurancePolicyNumber;
    }
}
