
package com.oops.practice_problems.ridehailing;

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    //getters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }
    //method to get vehicle details
    public String getVehicleDetails(){
        return "Vehicle id: "+vehicleId + ", Driver Name: "+driverName+", Rate per Km: "+ratePerKm;
    }
    //abstract method to calculate fare
    public abstract double calculateFare(double distance);

}
