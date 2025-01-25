package com.oops.practice_problems.bankingsystem;

public class BankingSystem {
    public static void main(String[] args) {
        // Created a SavingsAccount instance
        BankAccount savingsAccount = new SavingsAccount(5.0); // 5% interest rate
        savingsAccount.setAccountNumber(111);
        savingsAccount.setHolderName("Vivek");
        savingsAccount.setBalance(120000);

        // Performed operations on SavingsAccount
        System.out.println("------ Savings Account ------");
        savingsAccount.deposit(10000);
        savingsAccount.withdraw(20000);
        savingsAccount.displayDetails();

        // Accessed specific methods of SavingsAccount
        SavingsAccount specificSavingsAccount = (SavingsAccount) savingsAccount;
        specificSavingsAccount.calculateLoanEligibility();
        specificSavingsAccount.applyForLoan();
        savingsAccount.calculateInterest();

        // Created a CurrentAccount instance
        BankAccount currentAccount = new CurrentAccount();
        currentAccount.setAccountNumber(222);
        currentAccount.setHolderName("Suraj");
        currentAccount.setBalance(50000);

        // Performed operations on CurrentAccount
        System.out.println("\n------ Current Account ------");
        currentAccount.deposit(5000);
        currentAccount.withdraw(15000);
        currentAccount.displayDetails();

        // Accessed specific methods of CurrentAccount
        CurrentAccount specificCurrentAccount = (CurrentAccount) currentAccount;
        specificCurrentAccount.calculateLoanEligibility();
        specificCurrentAccount.applyForLoan();
        currentAccount.calculateInterest();
    }
}