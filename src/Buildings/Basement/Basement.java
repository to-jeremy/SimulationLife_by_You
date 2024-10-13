package Buildings.Basement;

public class Basement {
    private String basementId;
    private String associatedApartmentNumber;
    private double size;

    public Basement(String basementId, String associatedApartmentNumber, double size) {
        this.basementId = basementId;
        this.associatedApartmentNumber = associatedApartmentNumber;
        this.size = size;
    }

    // Getters and Setters

    public String getBasementId() {
        return basementId;
    }

    public void setBasementId(String basementId) {
        this.basementId = basementId;
    }

    public String getAssociatedApartmentNumber() {
        return associatedApartmentNumber;
    }

    public void setAssociatedApartmentNumber(String associatedApartmentNumber) {
        this.associatedApartmentNumber = associatedApartmentNumber;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
