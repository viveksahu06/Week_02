package com.oops.practice_problems.bankingsystem;

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public abstract void calculateInterest();

    //method to display details
    public void displayDetails() {
        System.out.println("----- Account Details -----");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    //setter method
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //getter method
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public double getBalance() {
        return balance;
    }
}