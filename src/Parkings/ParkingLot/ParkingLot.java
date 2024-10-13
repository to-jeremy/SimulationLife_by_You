package Parkings.ParkingLot;

import Parkings.ParkingSpace.ParkingSpace;

import java.util.List;

public class ParkingLot {
    private String parkingLotName;
    private String buildingName;
    private int buildingNumber;
    private List<ParkingSpace> parkingSpaces;

    public ParkingLot(String parkingLotName, String buildingName, int buildingNumber) {
        this.parkingLotName = parkingLotName;
        this.buildingName = buildingName;
        this.buildingNumber = buildingNumber;
    }

    // Getters and Setters

    public String getParkingLotName() {
        return parkingLotName;
    }

    public void setParkingLotName(String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public List<ParkingSpace> getParkingSpaces() {
        return parkingSpaces;
    }

    public void setParkingSpaces(List<ParkingSpace> parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }
}
