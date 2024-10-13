package Buildings.Building;

import Players.Person.Person;

import java.util.List;

public class Building {
    private int uniqueNumber; // Numéro unique du bâtiment
    private String name;
    private String type; // Residential, Commercial, etc.
    private String address;
    private List<Person> owners;
    private int numberOfFloors;
    private boolean hasParking;
    private int parkingSpaces; // Nombre de places de parking
    private Double price;

    public Building(int uniqueNumber, String name, String type, String address, int numberOfFloors, boolean hasParking, int parkingSpaces, Double price) {
        this.uniqueNumber = uniqueNumber;
        this.name = name;
        this.type = type;
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.hasParking = hasParking;
        this.parkingSpaces = parkingSpaces;
        this.price = price;
    }

    // Getters and Setters

    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Person> getOwners() {
        return owners;
    }

    public void setOwners(List<Person> owners) {
        this.owners = owners;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public boolean isHasParking() {
        return hasParking;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    public int getParkingSpaces() {
        return parkingSpaces;
    }

    public void setParkingSpaces(int parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
