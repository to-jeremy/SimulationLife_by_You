package Vehicles.Bike;

import Vehicles.Véhicle.Vehicle;

public class Bike extends Vehicle {
    public Bike(String modelName, String vehicleNumber, int numberOfSeats, Double enginePower, String fuelType, String transmission, String color, double price) {
        super(modelName, vehicleNumber, numberOfSeats, null, null, transmission, color, price);
    }
}
