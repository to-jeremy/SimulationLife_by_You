package Vehicles.Motorcycle;

import Vehicles.Véhicle.Vehicle;

public class Motorcycle extends Vehicle {
    public Motorcycle(String modelName, String vehicleNumber, int numberOfSeats, Double enginePower, String fuelType, String transmission, String color, double price) {
        super(modelName, vehicleNumber, numberOfSeats, enginePower, fuelType, transmission, color, price);
    }
}
