package com.oops.practice_problems.ridehailing;

public class Auto extends Vehicle implements GPS{
    private String currentLocation;
    //constructor to initialize
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }
    //override to get current location
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }
    //override to get updated location
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation= newLocation;
    }
    //override to get fare according to bike
    @Override
    public double calculateFare(double distance) {
        return distance*getRatePerKm();
    }
}
