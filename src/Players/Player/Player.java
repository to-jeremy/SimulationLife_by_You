package Players.Player;

import Banks.BankAccount.BankAccount;
import Buildings.Building.Building;
import Business.Company.Company;
import Players.Person.Person;
import Vehicles.Véhicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Player extends Person {
    private int playerID;
    private List<BankAccount> bankAccounts;
    private List<Company> companiesOwned;
    private List<Vehicle> vehiclesOwned;
    private List<Building> buildingsOwned;

    public Player(String firstName, String lastName, String gender, int age, String birthDate, int playerID) {
        super(firstName, lastName, gender, age, birthDate);
        this.playerID = playerID;
        this.bankAccounts = new ArrayList<>();
        this.companiesOwned = new ArrayList<>();
        this.vehiclesOwned = new ArrayList<>();
        this.buildingsOwned = new ArrayList<>();
    }

    // Getters and Setters

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public List<Company> getCompaniesOwned() {
        return companiesOwned;
    }

    public void setCompaniesOwned(List<Company> companiesOwned) {
        this.companiesOwned = companiesOwned;
    }

    public List<Vehicle> getVehiclesOwned() {
        return vehiclesOwned;
    }

    public void setVehiclesOwned(List<Vehicle> vehiclesOwned) {
        this.vehiclesOwned = vehiclesOwned;
    }

    public List<Building> getBuildingsOwned() {
        return buildingsOwned;
    }

    public void setBuildingsOwned(List<Building> buildingsOwned) {
        this.buildingsOwned = buildingsOwned;
    }

    // Méthode pour sélectionner un compte bancaire par son numéro de compte
    public BankAccount selectBankAccount(int accountNumber) {
        for (BankAccount account : bankAccounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        System.out.println("Le compte avec le numéro " + accountNumber + " n'a pas été trouvé.");
        return null;  // Retourne null si le compte n'existe pas
    }
}
