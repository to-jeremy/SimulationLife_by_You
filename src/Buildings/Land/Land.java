package Buildings.Land;

import Players.Person.Person;

import java.util.List;

public class Land {
    private String address;
    private List<Person> owners;
    private double area;
    private String zoningType; // Residential, Commercial, Agricultural, etc.
    private boolean isDeveloped;
    private double price;

    public Land(String address, double area, String zoningType) {
        this.address = address;
        this.area = area;
        this.zoningType = zoningType;
        this.isDeveloped = false;
    }

    // Getters and Setters

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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getZoningType() {
        return zoningType;
    }

    public void setZoningType(String zoningType) {
        this.zoningType = zoningType;
    }

    public boolean isDeveloped() {
        return isDeveloped;
    }

    public void setDeveloped(boolean developed) {
        isDeveloped = developed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
