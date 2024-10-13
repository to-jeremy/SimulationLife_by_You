package Banks.BankAccount;

import Banks.Loan.Loan;
import Business.Company.Company;
import Business.Factory.Factory;
import Business.Store.Store;
import Players.Person.Person;
import Players.Player.Player;

import java.util.List;

public class BankAccount {
    private int accountNumber;
    private Object owner;
    private double balance;
    private double interestRate;
    private List<Loan> loans;

    public BankAccount(int accountNumber, Object owner, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // Getters and Setters

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        if (owner instanceof Player) {
            return ((Player) owner).getFullName();
        } else if (owner instanceof Company) {
            return ((Company) owner).getName();
        } else if (owner instanceof Store) {
            return ((Store) owner).getName();
        } else if (owner instanceof Factory) {
            return ((Factory) owner).getName();
        }
        return "Inconnu";
    }

    public void setOwnerName(Object owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    // Méthode pour retirer de l'argent
    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Fonds insuffisants. Impossible de retirer " + amount + "€.");
            return false;  // Échec du retrait
        } else {
            balance -= amount;
            System.out.println("Retrait de " + amount + "€ réussi. Nouveau solde : " + balance + "€.");
            return true;  // Réussite du retrait
        }
    }

    // Méthode pour déposer de l'argent
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + "€ ont été déposés. Nouveau solde : " + balance + "€.");
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", ownerName='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}
