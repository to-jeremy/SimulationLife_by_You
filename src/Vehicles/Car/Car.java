package Vehicles.Car;

import Vehicles.Véhicle.Vehicle;

public class Car extends Vehicle {
    public Car(String modelName, String vehicleNumber, int numberOfSeats, Double enginePower, String fuelType, String transmission, String color, double price) {
        super(modelName, vehicleNumber, numberOfSeats, enginePower, fuelType, transmission, color, price);
    }
}
