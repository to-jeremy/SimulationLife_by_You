package Vehicles.Airplane;

import Vehicles.Véhicle.Vehicle;

public class Airplane extends Vehicle {
    private String airlineName;

    public Airplane(String modelName, String vehicleNumber, int numberOfSeats, Double enginePower, String fuelType, String transmission, String color, double price, String airlineName) {
        super(modelName, vehicleNumber, numberOfSeats, enginePower, fuelType, transmission, color, price);
        this.airlineName = airlineName;
    }

    // Getters and Setters

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }
}
