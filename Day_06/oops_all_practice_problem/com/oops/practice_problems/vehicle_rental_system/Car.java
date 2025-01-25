package com.oops.practice_problems.vehicle_rental_system;

public class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    //constructor to initialize
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    //overriding to calculate discount
    @Override
    public double calculateInsurance() {
        return getRentalRate()*0.05;
    }
    //overriding to get insurance information
    @Override
    public String getInsuranceDetails() {
        return "Policy Number: "+ insurancePolicyNumber;
    }
    //overriding to calculate rental cost
    @Override
    public double calculateRentalCost(int days) {
        return days*getRentalRate();
    }
}
