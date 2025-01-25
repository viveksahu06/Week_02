package com.oops.practice_problems.bankingsystem;

class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.0;

    @Override
    public void calculateInterest() {
        System.out.println("Interest: " + (getBalance() * (INTEREST_RATE / 100)));
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan application not available for Current Accounts.");
    }

    @Override
    public void calculateLoanEligibility() {
        System.out.println("Current Accounts are not eligible for loans.");
    }
}