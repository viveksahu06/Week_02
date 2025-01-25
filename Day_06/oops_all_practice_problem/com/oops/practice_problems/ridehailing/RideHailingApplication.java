//Ride-Hailing Application
//Description: Develop a ride-hailing application:
//Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
//Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
//Create subclasses Car, Bike, and Auto, overriding calculateFare() based on type-specific rates.
//Use an interface GPS with methods getCurrentLocation() and updateLocation().
//Secure driver and vehicle details using encapsulation.
//Demonstrate polymorphism by creating a method to calculate fares for different vehicle types dynamically.

package com.oops.practice_problems.ridehailing;

import java.util.ArrayList;
import java.util.List;

public class RideHailingApplication {
    public static void main(String[] args) {
        // Create a list to store different types of vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        // Add vehicles to the list
        vehicles.add(new Car("car1", "Vivek Sahu", 25.0));
        vehicles.add(new Bike("bike121", "Suraj Patel", 30.0));
        vehicles.add(new Auto("auto121", "Pratham Raj", 10.0));

        // Set initial locations using the setter method
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof GPS) {
                ((GPS) vehicle).updateLocation("Bhopal");
            }
        }

        // Distance for which fare needs to be calculated
        double distance = 20.0;

        // Iterate through the list of vehicles
        for (Vehicle vehicle : vehicles) {
            // Display vehicle details
            System.out.println(vehicle.getVehicleDetails());

            // Display current location
            if (vehicle instanceof GPS) {
                System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
            }

            // Calculate and display fare
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));
            System.out.println("***********************************************************************************");
        }

        // Update location for vehicles
        System.out.println("\n--- Updating Locations ---");
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof GPS) {
                ((GPS) vehicle).updateLocation("Indore");
                System.out.println(vehicle.getVehicleDetails() + " -> Updated Location: " + ((GPS) vehicle).getCurrentLocation());
            }
        }
    }
}