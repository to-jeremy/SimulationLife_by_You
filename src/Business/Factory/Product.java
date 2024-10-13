package Business.Factory;

public class Product {
    private String name;
    private String brand;
    private String type;
    private double price;

    public Product(String name, String brand, String type, double price) {
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " (Marque: " + brand + ", Type: " + type + ", Prix: " + price + "€)";
    }
}
