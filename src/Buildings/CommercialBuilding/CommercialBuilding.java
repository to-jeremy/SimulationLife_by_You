package Buildings.CommercialBuilding;

import Buildings.Building.Building;

public class CommercialBuilding extends Building {
    public CommercialBuilding(int uniqueNumber, String name, String address, int numberOfFloors, boolean hasParking, int parkingSpaces, Double price) {
        super(uniqueNumber, name, "Commercial", address, numberOfFloors, hasParking, parkingSpaces, price);
    }
}
