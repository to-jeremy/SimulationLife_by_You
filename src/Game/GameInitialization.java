package Game;

import Banks.Bank.Bank;
import Banks.BankAccount.BankAccount;
import Banks.Loan.Loan;
import Business.Company.Company;
import Business.Factory.Factory;
import Business.Store.Store;
import Players.Person.Person;
import Players.Player.Player;
import State.City.City;
import State.Country.Country;
import State.Department.Department;
import State.District.District;
import State.Region.Region;

import java.util.ArrayList;
import java.util.List;

public class GameInitialization {
    public static void main(String[] args) {
        //Étape 1 : Initialisation des Entités
        System.out.println("Étape 1 : Création du pays...");
        // Création des districts
        District district1 = new District("Centre-Ville", 1, 5000);
        District district2 = new District("Banlieue", 2, 8000);
        List<District> districtsCity1 = new ArrayList<>();
        districtsCity1.add(district1);
        districtsCity1.add(district2);

        // Création des villes
        City city1 = new City("Paris", 1, 13000);
        city1.setDistricts(districtsCity1);

        City city2 = new City("Lyon", 2, 10000);

        // Création des départements
        Department department1 = new Department("Île-de-France", 1, 23000);
        List<City> citiesDepartment1 = new ArrayList<>();
        citiesDepartment1.add(city1);
        citiesDepartment1.add(city2);
        department1.setCities(citiesDepartment1);

        // Création des régions
        Region region1 = new Region("Nord", 1, 30000);
        List<Department> departmentsRegion1 = new ArrayList<>();
        departmentsRegion1.add(department1);
        region1.setDepartments(departmentsRegion1);

        // Création du pays
        Country country = new Country("France", 1, 67000000, "Française");
        List<Region> regionsCountry = new ArrayList<>();
        regionsCountry.add(region1);
        country.setRegions(regionsCountry);

        // Affichage des informations du pays
        displayCountryInfo(country);


        ////Étape 4 : Intégration des Citoyens
        System.out.println("Étape 4 : Création des citoyens...");
        // Création d'un joueur (citoyen)
        Player player1 = new Player("Jean", "Dupont", "M", 30, "2024-09-06",1);
        Player player2 = new Player("Alice", "Martin", "F",25, "2024-09-06",2);

        // Création de comptes bancaires pour les citoyens
        BankAccount player1Account = new BankAccount(1, player1,10000, 0);
        BankAccount player2Account = new BankAccount(2, player2,500, 0);
        BankAccount player3Account = new BankAccount(3, player2,20000, 0);

        //Liste des comptes par joueur
        List<BankAccount> accounts1 = new ArrayList<>();
        accounts1.add(player1Account);
        List<BankAccount> accounts2 = new ArrayList<>();
        accounts2.add(player2Account);
        accounts2.add(player3Account);

        // Associer les comptes bancaires aux joueurs
        player1.setBankAccounts(accounts1);
        player2.setBankAccounts(accounts2);

        // Affichage des informations des citoyens
        displayPlayerInfo(player1);
        displayPlayerInfo(player2);

        //Étape 2 : Intégration des Entreprises
        System.out.println("Étape 2 : Création des entreprises...");

        //Liste de groupes des fondateurs
        List<Person> founder1 = new ArrayList<>();
        founder1.add(player1);

        List<Person> founder2 = new ArrayList<>();
        founder2.add(player2);

        // Création d'une entreprise
        Company company1 = new Company("Tech Innovators", founder1, "Technologies", "123 Sky Lane",500000);
        Company company2 = new Company("Auto Corp", founder2,"Automobile","456 Green St", 100000);

        // Création d'une usine pour l'entreprise 1
        Factory factory1 = new Factory("Usine Tech", founder1,"Electronique", "Zone Industrielle", 200000);
        company1.addFactory(factory1);

        // Création d'un magasin pour l'entreprise 1
        Store store1 = new Store("Tech Store", founder2,"Electronique", "Centre Commercial", 100000);
        company1.addStore(store1);

        // Création d'une usine et magasin pour l'entreprise 2
        Factory factory2 = new Factory("Usine Auto", founder2,"Automobile", "Zone Industrielle", 300000);
        company2.addFactory(factory2);

        Store store2 = new Store("Auto Shop", founder1,"Automobile", "Boulevard Central", 150000);
        company2.addStore(store2);

        // Affichage des informations des entreprises
        System.out.println("Affichage comptes bancaires entreprises 1 !");
        displayCompanyInfo(company1);
        displayCompanyInfo(company2);


        //Étape 3 : Intégration des Banques
        System.out.println("Étape 3 : Création des banques...");
        // Création de la banque nationale
        Bank nationalBank = new Bank("Banque Nationale", "Gouvernement", "2024-09-06","Elysée",1000000);

        // Création de banques pour la population et les entreprises
        Bank citizenBank = new Bank("Banque des Citoyens", "Privé", "2024-09-06","Paris 14",1000000);
        Bank businessBank = new Bank("Banque des Entreprises", "Privé","2024-09-06" ,"Paris 16",5000000);

        // Création de comptes pour les entreprises
        BankAccount company1Account = new BankAccount(1, company1,company1.getCapital(), 0);
        BankAccount company2Account = new BankAccount(2, company2, company2.getCapital(), 0);
        businessBank.addAccount(company1Account);
        businessBank.addAccount(company2Account);

        // Associer les comptes bancaires aux entreprises
        company1.setBankAccount(company1Account);
        company2.setBankAccount(company2Account);

        // Création de comptes pour le magasin et l'usine
        BankAccount store1Account = new BankAccount(3, store1, store1.getCapital(), 0);
        BankAccount factory2Account = new BankAccount(4, factory2, factory2.getCapital(), 0);
        businessBank.addAccount(store1Account);
        businessBank.addAccount(factory2Account);

        store1.setBankAccount(store1Account);
        factory2.setBankAccount(factory2Account);

        // Affichage des informations des entreprises
        System.out.println("Affichage comptes bancaires entreprises 2 !");
        displayCompanyInfo(company1);
        displayCompanyInfo(company2);

        citizenBank.addAccount(player1Account);
        //Ajouter la liste de comptes "accounts2" à la banque
        for (BankAccount account : accounts2) {
            citizenBank.addAccount(account);
        }

        System.out.println("Test 1...");
        displayBankInfo(businessBank);

        // Création d'un prêt pour l'entreprise 1
        Loan loan1 = new Loan(company1Account, 50000, 25, "2024-09-06", 1);
        businessBank.addLoan(loan1);

        // Création d'un prêt pour le joueur 1
        Loan loan2 = new Loan(player1Account, 2500, 20, "2024-09-06", 2);
        citizenBank.addLoan(loan2);

        // Affichage des informations des banques
        displayBankInfo(nationalBank);
        displayBankInfo(citizenBank);
        displayBankInfo(businessBank);

        // Étape 5 : Remboursement du prêt
        System.out.println("Étape 5 : Remboursement du prêt...");

        //businessBank.getLoanByAccount(company1Account);
        loan1.repay(62500);
        loan2.repay(1000);


        //Étape 6 : Interactions entre citoyens, entreprises et banques
        /*System.out.println("Étape 6 : Interactions entre citoyens, entreprises et banques...");
        //Récupération du magasin concerné appartement à l'entreprise citée
        store1 = company1.getStores().get(0);
        // Ajout de produits dans les magasins
        store1.addProductS("Ordinateur", "Apple", "Laptop", 1500);
        store1.addProductS("Smartphone", "Samsung", "Mobile", 800);

        //Récupération du magasin concerné appartement à l'entreprise citée
        factory2 = company2.getFactories().get(0);
        // Ajout de produits dans les magasins
        factory2.addProductF("Tablette", "Xiaomi", "Tablet", 300);
        factory2.addProductF("Montre connectée", "Huawei", "Watch", 120);

        // Le citoyen 1 achète un produit
        buyProductStore(player1, store1, "Ordinateur", player1Account);
        buyProductStore(player2, store1, "Smartphone", player2Account);

        buyProductFactory(player1, factory2, "Tablette", player1Account);
        buyProductFactory(player2, factory2, "Montre connectée", player2Account);

        // Affichage du solde des citoyens après achat
        displayPlayerInfo(player1);
        displayPlayerInfo(player2);

        System.out.println("Test 2...");
        displayBankInfo(businessBank);*/
    }

    public static void buyProductStore(Player player, Store store, String productName, BankAccount specifiedAccount) {
        // Vérifier si le produit est disponible
        double productPriceS = store.getProductPriceS(productName);

        if (productPriceS > 0) {
            // Essayer de retirer du compte spécifié
            double remainingAmount = attemptWithdrawal(specifiedAccount, productPriceS);

            // Si le compte spécifié n'a pas assez de fonds, chercher le compte avec le plus de fonds
            if (remainingAmount > 0) {
                BankAccount backupAccount = getAccountWithMostFunds(player, remainingAmount);

                if (backupAccount != null) {
                    System.out.println("Fonds insuffisants dans le compte spécifié. Retrait du reste (" + remainingAmount + "€) depuis le compte avec le plus de fonds : " + backupAccount.getAccountNumber());
                    attemptWithdrawal(backupAccount, remainingAmount);
                } else {
                    System.out.println(player.getFullName() + " n'a pas suffisamment de fonds sur l'ensemble de ses comptes pour acheter " + productName + ".");
                    return;  // Échec de l'achat
                }
            }

            // Ajouter l'argent au compte du magasin)
            store.getBankAccount().deposit(productPriceS);

            System.out.println(player.getFullName() + " a acheté " + productName + " pour " + productPriceS + "€.");
        } else {
            System.out.println("Le produit " + productName + " n'est pas disponible dans le magasin.");
        }
    }

    public static void buyProductFactory(Player player, Factory factory, String productName, BankAccount specifiedAccount) {
        // Vérifier si le produit est disponible
        double productPriceF = factory.getProductPriceF(productName);

        if (productPriceF > 0) {
            // Essayer de retirer du compte spécifié
            double remainingAmount = attemptWithdrawal(specifiedAccount, productPriceF);

            // Si le compte spécifié n'a pas assez de fonds, chercher le compte avec le plus de fonds
            if (remainingAmount > 0) {
                BankAccount backupAccount = getAccountWithMostFunds(player, remainingAmount);

                if (backupAccount != null) {
                    System.out.println("Fonds insuffisants dans le compte spécifié. Retrait du reste (" + remainingAmount + "€) depuis le compte avec le plus de fonds : " + backupAccount.getAccountNumber());
                    attemptWithdrawal(backupAccount, remainingAmount);
                } else {
                    System.out.println(player.getFullName() + " n'a pas suffisamment de fonds sur l'ensemble de ses comptes pour acheter " + productName + ".");
                    return;  // Échec de l'achat
                }
            }

            // Ajouter l'argent au compte du magasin)
            factory.getBankAccount().deposit(productPriceF);

            System.out.println(player.getFullName() + " a acheté " + productName + " pour " + productPriceF + "€.");
        } else {
            System.out.println("Le produit " + productName + " n'est pas disponible l'entrepôt de l'usine.");
        }
    }

    // Méthode pour essayer de retirer un montant et retourner la différence si les fonds sont insuffisants
    public static double attemptWithdrawal(BankAccount account, double amount) {
        if (account.getBalance() >= amount) {
            account.withdraw(amount);
            return 0;  // Tout le montant a été retiré avec succès
        } else {
            double balance = account.getBalance();
            account.withdraw(balance);  // Retire tout ce qui est disponible
            return amount - balance;  // Retourne le montant restant à retirer
        }
    }

    // Méthode pour récupérer le compte du joueur avec le plus de fonds, capable de couvrir le montant restant
    public static BankAccount getAccountWithMostFunds(Player player, double remainingAmount) {
        BankAccount richestAccount = null;
        double maxFunds = 0;

        for (BankAccount account : player.getBankAccounts()) {
            if (account.getBalance() > maxFunds) {
                maxFunds = account.getBalance();
                richestAccount = account;
            }
        }

        // Retourne le compte avec le plus de fonds s'il a suffisamment pour couvrir le montant restant
        return (richestAccount != null && maxFunds >= remainingAmount) ? richestAccount : null;
    }

    public static void displayCountryInfo(Country country) {
        System.out.println("Nom du pays : " + country.getName());
        System.out.println("Population totale : " + country.getPopulation());
        System.out.println("Régions : ");
        for (Region region : country.getRegions()) {
            System.out.println("- Région : " + region.getName() + ", Population : " + region.getPopulation());
            for (Department department : region.getDepartments()) {
                System.out.println("  * Département : " + department.getName() + ", Population : " + department.getPopulation());
                for (City city : department.getCities()) {
                    System.out.println("    > Ville : " + city.getName() + ", Population : " + city.getPopulation());
                    for (District district : city.getDistricts()) {
                        System.out.println("      - District : " + district.getName() + ", Population : " + district.getPopulation());
                    }
                }
            }
        }
    }

    public static void displayCompanyInfo(Company company) {
        System.out.println("Entreprise : " + company.getName());
        System.out.println("Capital : " + company.getCapital() + "€");

        // Affichage du compte bancaire de l'entreprise
        BankAccount companyAccount = company.getBankAccount();
        if (companyAccount != null) {
            System.out.println("Compte bancaire de l'entreprise : ");
            System.out.println("- Numéro de compte : " + companyAccount.getAccountNumber());
            System.out.println("- Solde : " + companyAccount.getBalance() + "€");
        } else {
            System.out.println("Aucun compte bancaire associé à l'entreprise.");
        }

        // Affichage des usines de l'entreprise
        System.out.println("Usines : ");
        for (Factory factory : company.getFactories()) {
            System.out.println("- Usine : " + factory.getName() + ", Type : " + factory.getType() + ", Capital : " + factory.getCapital() + "€");

            // Affichage du compte bancaire associé à l'usine
            BankAccount factoryAccount = factory.getBankAccount(); // Assurez-vous que la classe Factory a un compte bancaire
            if (factoryAccount != null) {
                System.out.println("  Compte bancaire de l'usine : ");
                System.out.println("  - Numéro de compte : " + factoryAccount.getAccountNumber());
                System.out.println("  - Solde : " + factoryAccount.getBalance() + "€");
            } else {
                System.out.println("  Aucun compte bancaire associé à cette usine.");
            }
        }

        // Affichage des magasins de l'entreprise
        System.out.println("Magasins : ");
        for (Store store : company.getStores()) {
            System.out.println("- Magasin : " + store.getName() + ", Type : " + store.getType() + ", Capital : " + store.getCapital() + "€");

            // Affichage du compte bancaire associé au magasin
            BankAccount storeAccount = store.getBankAccount(); // Assurez-vous que la classe Store a un compte bancaire
            if (storeAccount != null) {
                System.out.println("  Compte bancaire du magasin : ");
                System.out.println("  - Numéro de compte : " + storeAccount.getAccountNumber());
                System.out.println("  - Solde : " + storeAccount.getBalance() + "€");
            } else {
                System.out.println("  Aucun compte bancaire associé à ce magasin.");
            }
        }
    }

    public static void displayBankInfo(Bank bank) {
        System.out.println("Nom de la banque : " + bank.getName());
        System.out.println("Type : " + bank.getType());
        System.out.println("Capital : " + bank.getCapital() + "€");
        System.out.println("Comptes : ");
        for (BankAccount account : bank.getAccounts()) {
            System.out.println("- Compte : " + account.getOwnerName() + ", Solde : " + account.getBalance() + "€");
        }
        System.out.println("Prêts : ");
        for (Loan loan : bank.getLoans()) {
            System.out.println("- Prêt n° " + loan.getLoanNumber() + " à " + loan.getBorrowerAccount().getOwnerName() + ", Montant : " + loan.getInitialAmount() + "€, Taux d'intérêt : " + loan.getInterestRate() + "%, Montant total à rembourser : " + loan.getTotalRepaymentAmount() + "€");
        }
    }

    public static void displayPlayerInfo(Player player) {
        if (player.getAge() <= 1) {
            System.out.println("Citoyen : " + player.getFullName() + ", Âge : " + player.getAge() + " an");
        } else {
            System.out.println("Citoyen : " + player.getFullName() + ", Âge : " + player.getAge() + " ans");
        }

        List<BankAccount> accounts = player.getBankAccounts();
        if (!accounts.isEmpty()) {
            System.out.println("Comptes bancaires :");
            for (BankAccount account : accounts) {
                System.out.println("- Numéro : " + account.getAccountNumber() + ", Capital : "+ account.getBalance() + "€");
            }
        } else {
            System.out.println("Aucun compte bancaire associé");
        }
    }
}