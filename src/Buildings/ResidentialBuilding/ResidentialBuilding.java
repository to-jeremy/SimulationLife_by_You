package Buildings.ResidentialBuilding;

import Buildings.Building.Building;

public class ResidentialBuilding extends Building {
    private int numberOfApartments;

    public ResidentialBuilding(int uniqueNumber, String name, String address, int numberOfFloors, boolean hasParking, int parkingSpaces, int numberOfApartments, Double price) {
        super(uniqueNumber, name, "Residential", address, numberOfFloors, hasParking, parkingSpaces, price);
        this.numberOfApartments = numberOfApartments;
    }

    // Getters et Setters spécifiques à Buildings.ResidentialBuilding

    public int getNumberOfApartments() {
        return numberOfApartments;
    }

    public void setNumberOfApartments(int numberOfApartments) {
        this.numberOfApartments = numberOfApartments;
    }
}
