package Banks.Loan;

import Banks.BankAccount.BankAccount;

public class Loan {
    private static int loanCounter = 0; // Compteur pour générer des numéros uniques
    private int loanNumber;
    private double initialAmount; // Montant initial du prêt
    private double amountRemaining; // Montant restant à rembourser
    private double interestRate;
    private String loanDate;
    private String repaymentDate;
    private boolean isRepaid;
    private BankAccount borrowerAccount;
    private int loanDurationYears;

    public Loan(BankAccount borrowerAccount, double amount, double interestRate, String loanDate, int loanDurationYears) {
        this.loanNumber = ++loanCounter;
        this.borrowerAccount = borrowerAccount;
        this.initialAmount = amount;
        this.amountRemaining = getTotalRepaymentAmount(); // Initialise avec le montant total à rembourser
        this.interestRate = interestRate;
        this.loanDate = loanDate;
        this.loanDurationYears = loanDurationYears;
        this.isRepaid = false;
    }

    // Getters and Setters
    public int getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;
    }

    public double getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(double amount) {
        this.initialAmount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(String repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public boolean isRepaid() {
        return isRepaid;
    }

    public void setRepaid(boolean repaid) {
        isRepaid = repaid;
    }

    public BankAccount getBorrowerAccount() {
        return borrowerAccount;
    }

    public void setBorrowerAccount(BankAccount borrowerAccount) {
        this.borrowerAccount = borrowerAccount;
    }

    public int getLoanDurationYears() {
        return loanDurationYears;
    }

    public void setLoanDurationYears(int loanDurationYears) {
        this.loanDurationYears = loanDurationYears;
    }

    public double getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(double amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    // Méthode pour calculer le montant total à rembourser (avec intérêts)
    public double getTotalRepaymentAmount() {
        return this.initialAmount * Math.pow(1 + this.interestRate / 100, this.loanDurationYears);
    }

    // Méthode pour rembourser le prêt
    public void repay(double amount) {
        if (amount > 0 && !isRepaid) {
            // Vérifier si le remboursement dépasse le montant restant
            if (amount > this.amountRemaining) {
                System.out.println("Montant du remboursement dépasse le montant restant. Remboursement partiel.");
                amount = this.amountRemaining; // Limiter le remboursement au montant restant
            }

            // Débiter le compte emprunteur
            boolean success = borrowerAccount.withdraw(amount);
            if (success) {
                this.amountRemaining -= amount; // Réduire le montant du prêt restant

                // Vérifier si le prêt est entièrement remboursé
                if (this.amountRemaining <= 0) {
                    this.isRepaid = true; // Marquer le prêt comme remboursé
                    this.amountRemaining = 0; // S'assurer que le montant restant est zéro
                    System.out.println("Numéro prêt : " + loanNumber + ". Le prêt a été entièrement remboursé.");
                } else {
                    System.out.println("Remboursement effectué : " + amount + "€. Montant restant : " + this.amountRemaining + "€.");
                }
            } else {
                System.out.println("Le remboursement a échoué. Montant restant du prêt : " + this.amountRemaining + "€.");
            }
        } else {
            System.out.println("Le prêt est déjà remboursé ou le montant est invalide.");
        }
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanNumber=" + loanNumber +
                ", initialAmount=" + initialAmount +
                ", amountRemaining=" + amountRemaining +
                ", interestRate=" + interestRate +
                ", loanDate='" + loanDate + '\'' +
                ", repaymentDate='" + repaymentDate + '\'' +
                ", isRepaid=" + isRepaid +
                ", borrowerAccount=" + borrowerAccount.getAccountNumber() +
                ", loanDurationYears=" + loanDurationYears +
                '}';
    }
}
