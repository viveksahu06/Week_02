//Vehicle Rental System
//Description: Design a system to manage vehicle rentals:
//Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
//Add an abstract method calculateRentalCost(int days).
//Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
//Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
//Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
//Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.

package com.oops.practice_problems.vehicle_rental_system;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    //constructor to storage

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    //getter


    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }


    public abstract double calculateRentalCost(int days);


}
