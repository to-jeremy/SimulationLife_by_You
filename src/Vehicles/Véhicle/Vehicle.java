package Vehicles.Véhicle;

import Players.Person.Person;

import java.util.List;

public class Vehicle {
    private String modelName;
    private String vehicleNumber;
    private List<Person> owners;
    private List<Person> renters;
    private int numberOfSeats;
    private Double fiscalPower;
    private Double enginePower;
    private Double trunkCapacity;
    private String fuelType; // Essence, Hybride, Electrique
    private String transmission; // Mécanique, Automatique
    private String color;
    private double price;

    public Vehicle(String modelName, String vehicleNumber, int numberOfSeats, Double enginePower, String fuelType, String transmission, String color, double price) {
        this.modelName = modelName;
        this.vehicleNumber = vehicleNumber;
        this.numberOfSeats = numberOfSeats;
        this.enginePower = enginePower;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.color = color;
        this.price = price;
    }

    // Getters and Setters

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public List<Person> getOwners() {
        return owners;
    }

    public void setOwners(List<Person> owners) {
        this.owners = owners;
    }

    public List<Person> getRenters() {
        return renters;
    }

    public void setRenters(List<Person> renters) {
        this.renters = renters;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getFiscalPower() {
        return fiscalPower;
    }

    public void setFiscalPower(Double fiscalPower) {
        this.fiscalPower = fiscalPower;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(Double enginePower) {
        this.enginePower = enginePower;
    }

    public double getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(Double trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
