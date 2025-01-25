package com.oops.practice_problems.bankingsystem;

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    // Constructor
    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan application for Savings Account is submitted.");
    }

    @Override
    public void calculateLoanEligibility() {
        if (getBalance() > 100000) {
            System.out.println("Savings Account is eligible for a loan.");
        } else {
            System.out.println("Savings Account is not eligible for a loan.");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * (interestRate / 100);
        System.out.println("Calculated Interest: " + interest);
    }
}
