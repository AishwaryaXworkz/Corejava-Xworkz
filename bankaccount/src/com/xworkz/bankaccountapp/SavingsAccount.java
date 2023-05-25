package com.xworkz.bankaccountapp;

import com.xworkz.bankaccountapp.bankapp.BankAccount;

public class SavingsAccount extends BankAccount {
    double interestRate ;
    public SavingsAccount(double interestRate)
    {
        this.interestRate = interestRate;

    }

    public void  addPeriodicInterest()
    {
        double interest = (getBalance() * interestRate) / 100;
        this.credit(interest);
    }
    public static void endOfMonth(SavingsAccount account){
        account.addPeriodicInterest();
    }
}