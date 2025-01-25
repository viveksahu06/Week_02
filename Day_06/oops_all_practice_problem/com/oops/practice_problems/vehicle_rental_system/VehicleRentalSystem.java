//Vehicle Rental System
//Description: Design a system to manage vehicle rentals:
//Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
//Add an abstract method calculateRentalCost(int days).
//Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
//Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
//Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
//Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.

package com.oops.practice_problems.vehicle_rental_system;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 100.0, "CARPOL12345"));
        vehicles.add(new Bike("BIKE456", 50.0, "BIKEPOL67890"));
        vehicles.add(new Truck("TRUCK789", 200.0, "TRUCKPOL54321"));

        int rentalDays = 5;

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Rental Cost for " + rentalDays + " days: $" + vehicle.calculateRentalCost(rentalDays));

            // Polymorphism with Insurable interface
            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: $" + insurable.calculateInsurance());
                System.out.println("*************************************");
            }
            }

    }

}
