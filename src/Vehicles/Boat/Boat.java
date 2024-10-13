package Vehicles.Boat;

import Vehicles.Véhicle.Vehicle;

public class Boat extends Vehicle {
    private String maritimeCompany;

    public Boat(String modelName, String vehicleNumber, int numberOfSeats, Double enginePower, String fuelType, String transmission, String color, double price, String maritimeCompany) {
        super(modelName, vehicleNumber, numberOfSeats, enginePower, fuelType, transmission, color, price);
        this.maritimeCompany = maritimeCompany;
    }

    // Getters and Setters

    public String getMaritimeCompany() {
        return maritimeCompany;
    }

    public void setMaritimeCompany(String maritimeCompany) {
        this.maritimeCompany = maritimeCompany;
    }
}
