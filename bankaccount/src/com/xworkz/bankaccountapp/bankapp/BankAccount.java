package com.xworkz.bankaccountapp.bankapp;

public class BankAccount {
    private double balance;

    public void credit(double amount) {

        balance =amount +balance;
    }

    public void debit(double amount){
        balance = balance - amount;
    }

    public double getBalance(){
        return balance;
    }


    public void transfer(BankAccount zudioAccount,double amount) {
        this.debit(amount);
        zudioAccount.credit(amount);
    }
}

