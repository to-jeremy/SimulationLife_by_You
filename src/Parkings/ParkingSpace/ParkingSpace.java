package Parkings.ParkingSpace;

public class ParkingSpace {
    private int parkingSpaceId;
    private Double associatedApartmentNumber;
    private String parkingLotName;

    public ParkingSpace(int parkingSpaceId, Double associatedApartmentNumber, String parkingLotName) {
        this.parkingSpaceId = parkingSpaceId;
        this.associatedApartmentNumber = associatedApartmentNumber;
        this.parkingLotName = parkingLotName;
    }

    // Getters and Setters

    public int getParkingSpaceId() {
        return parkingSpaceId;
    }

    public void setParkingSpaceId(int parkingSpaceId) {
        this.parkingSpaceId = parkingSpaceId;
    }

    public Double getAssociatedApartmentNumber() {
        return associatedApartmentNumber;
    }

    public void setAssociatedApartmentNumber(Double associatedApartmentNumber) {
        this.associatedApartmentNumber = associatedApartmentNumber;
    }

    public String getParkingLotName() {
        return parkingLotName;
    }

    public void setParkingLotName(String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }
}
