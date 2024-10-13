package Banks.Bank;

import Banks.BankAccount.BankAccount;
import Banks.Loan.Loan;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private String type;
    private String creationDate;
    private String closureDate;
    private String headquartersAddress;
    private double capital;
    private List<BankAccount> accounts; // Liste des comptes bancaires
    private List<Loan> loans; // Liste des prêts

    public Bank(String name, String type, String creationDate, String headquartersAddress, double capital) {
        this.name = name;
        this.type = type;
        this.creationDate = creationDate;
        this.headquartersAddress = headquartersAddress;
        this.capital = capital;
        this.accounts = new ArrayList<>(); // Initialisation de la liste des comptes
        this.loans = new ArrayList<>(); // Initialisation de la liste des prêts
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getClosureDate() {
        return closureDate;
    }

    public void setClosureDate(String closureDate) {
        this.closureDate = closureDate;
    }

    public String getHeadquartersAddress() {
        return headquartersAddress;
    }

    public void setHeadquartersAddress(String headquartersAddress) {
        this.headquartersAddress = headquartersAddress;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    // Méthode pour ajouter un prêt à la liste des prêts
    public void addLoan(Loan loan) {
        double loanAmount = loan.getAmountRemaining(); // Montant du prêt demandé
        double totalAmountToRepay = loan.getTotalRepaymentAmount(); // Montant total à rembourser incluant les intérêts

        if (totalAmountToRepay <= this.capital) {
            // Ajouter le prêt à la liste des prêts
            loans.add(loan);

            // Déduire le montant du prêt du capital de la banque
            this.capital -= loanAmount;

            // Créditer le compte de l'entreprise avec le montant du prêt
            BankAccount borrowerAccount = loan.getBorrowerAccount();
            borrowerAccount.deposit(loanAmount);

            // Initialiser le montant restant à rembourser dans le prêt
            loan.setAmountRemaining(totalAmountToRepay);

            System.out.println("Le prêt de " + loanAmount + "€ a été ajouté avec succès. Montant total à rembourser (intérêts inclus) : " + totalAmountToRepay + "€.");
            System.out.println("Capital restant de la " + this.name + " : " + this.capital + "€.");
        } else {
            System.out.println("Capital insuffisant pour accorder le prêt.");
        }
    }

    // Méthode pour ajouter un compte bancaire à la liste des comptes
    public void addAccount(BankAccount account) {
        if (accounts == null) {
            accounts = new ArrayList<>();
        }
        accounts.add(account);
        System.out.println("Le compte " + account.getOwnerName() + " a été ajouté avec succès.");
    }

    // Méthode pour supprimer un compte bancaire de la liste des comptes
    public void deleteAccount(BankAccount account) {
        if (accounts.contains(account)) {
            accounts.remove(account);
            System.out.println("Le compte a été supprimé avec succès.");
        } else {
            System.out.println("Le compte n'existe pas dans la banque.");
        }
    }

    // Méthode pour obtenir un prêt par compte bancaire
    public Loan getLoanByAccount(BankAccount account) {
        System.out.println("Recherche de prêt pour le compte : " + account.getAccountNumber());
        for (Loan loan : loans) {
            System.out.println("Vérification du prêt : " + loan);
            if (loan.getBorrowerAccount().equals(account)) {
                System.out.println("Prêt trouvé : " + loan.getInitialAmount());
                return loan;
            }
        }
        System.out.println("Aucun prêt trouvé pour le compte : " + account.getAccountNumber());
        return null;
    }
}
