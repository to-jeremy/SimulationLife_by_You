package Business.Factory;

import Banks.BankAccount.BankAccount;
import Players.Person.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Factory {
    private String name;
    private List<Person> founders;
    private String type;
    private String address;
    private double capital;
    private Map<String, Product> products;  // Stocker les produits et leurs prix
    private BankAccount bankAccount;  // Solde de l'usine si non lié à une entreprise

    public Factory(String name, List<Person> founders, String type, String address, double capital) {
        this.name = name;
        this.founders = founders;
        this.type = type;
        this.address = address;
        this.capital = capital;
        this.products = new HashMap<>();  // Initialisation des produits
        //this.bankAccount = bankAccount;  // Solde initial de l'usine
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getFounders() {
        return founders;
    }

    public void setFounders(List<Person> founders) {
        this.founders = founders;
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

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    // Méthode pour ajouter un produit à l'entrepôt de l'usine
    public void addProductF(String name, String brand, String type, double price) {
        Product product = new Product(name, brand, type, price);
        products.put(name, product);
        System.out.println("Produit ajouté à l'entrepôt de l'usine " + this.name + " : " + product);
    }

    // Méthode pour supprimer un produit de l'entrepôt de l'usine
    public void deleteProduct(String productName) {
        if (products.containsKey(productName)) {
            products.remove(productName);
            System.out.println("Produit supprimé : " + productName);
        } else {
            System.out.println("Le produit " + productName + " n'existe pas.");
        }
    }

    // Méthode pour obtenir le prix d'un produit
    public double getProductPriceF(String productName) {
        Product product = products.get(productName);
        if (product != null) {
            return product.getPrice();
        }
        return -1.0;  // Retourne -1 si le produit n'existe pas
    }

    // Méthode pour afficher les détails de tous les produits
    public void displayProducts() {
        System.out.println("Produits disponibles dans le magasin " + name + " :");
        for (Product product : products.values()) {
            System.out.println("- " + product);
        }
    }
}
