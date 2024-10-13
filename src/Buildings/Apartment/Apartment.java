package Buildings.Apartment;

import Players.Person.Person;

import java.util.List;

public class Apartment {
    private String apartmentNumber;
    private String address;
    private double price;
    private int numberOfRooms;
    private int numberOfBathrooms;
    private boolean hasBalcony;
    private boolean hasTerrace;
    private List<Person> owners;
    private List<Person> renters;
    private String residentialBuildingNumber; // Numéro unique du bâtiment résidentiel associé

    public Apartment(String apartmentNumber, String address, double price, int numberOfRooms, int numberOfBathrooms, String residentialBuildingNumber) {
        this.apartmentNumber = apartmentNumber;
        this.address = address;
        this.price = price;
        this.numberOfRooms = numberOfRooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.residentialBuildingNumber = residentialBuildingNumber;
    }

    // Getters and Setters

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isHasTerrace() {
        return hasTerrace;
    }

    public void setHasTerrace(boolean hasTerrace) {
        this.hasTerrace = hasTerrace;
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

    public String getResidentialBuildingNumber() {
        return residentialBuildingNumber;
    }

    public void setResidentialBuildingNumber(String residentialBuildingNumber) {
        this.residentialBuildingNumber = residentialBuildingNumber;
    }
}
