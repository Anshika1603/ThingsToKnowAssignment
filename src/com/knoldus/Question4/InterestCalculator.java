package com.knoldus.Question4;
class BankAccount {
    private static double interestRate = 0.05;
    private double balance;

    public double calculateInterest() {
        return balance * interestRate;
    }


    public void setBalance(int balance) {
        this.balance=balance;
    }
}

public class InterestCalculator {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(1000);
        double interest = account.calculateInterest();
        System.out.println(interest);
    }
}
