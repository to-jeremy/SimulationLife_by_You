package Business.Company;

import Banks.BankAccount.BankAccount;
import Business.Factory.Factory;
import Players.Person.Person;
import Business.Store.Store;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Person> founders;
    private String type;
    private String address;
    private double capital;
    private List<Factory> factories;
    private List<Store> stores;
    private BankAccount bankAccount;

    public Company(String name, List<Person> founders, String type, String address, double capital) {
        this.name = name;
        this.founders = founders;
        this.type = type;
        this.address = address;
        this.capital = capital;
        //this.bankAccount = bankAccount;
        this.factories = new ArrayList<>();
        this.stores = new ArrayList<>();
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

    public List<Factory> getFactories() {
        return factories;
    }

    public void setFactories(List<Factory> factories) {
        this.factories = factories;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    // Add a factory to the company
    public void addFactory(Factory factory) {
        if (factory != null) {
            factories.add(factory);
            System.out.println("Usine " + factory.getName() + " ajoutée à l'entreprise " + name + ".");
        } else {
            System.out.println("Usine invalide.");
        }
    }

    // Remove a factory from the company
    public void deleteFactory(Factory factory) {
        if (factories.remove(factory)) {
            System.out.println("Usine " + factory.getName() + " supprimée de l'entreprise " + name + ".");
        } else {
            System.out.println("Usine " + factory.getName() + " non trouvée dans l'entreprise " + name + ".");
        }
    }

    // Add a store to the company
    public void addStore(Store store) {
        if (store != null) {
            stores.add(store);
            System.out.println("Magasin " + store.getName() + " ajouté à l'entreprise " + name + ".");
        } else {
            System.out.println("Magasin invalide.");
        }
    }

    // Remove a store from the company
    public void deleteStore(Store store) {
        if (stores.remove(store)) {
            System.out.println("Magasin " + store.getName() + " supprimé de l'entreprise " + name + ".");
        } else {
            System.out.println("Magasin " + store.getName() + " non trouvé dans l'entreprise " + name + ".");
        }
    }
}
