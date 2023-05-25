package com.xworkz.bankaccountapp;


import com.xworkz.bankaccountapp.bankapp.BankAccount;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount bankaccount = new BankAccount();
        System.out.println("current available  balance before credit is "+bankaccount.getBalance());
        bankaccount.credit(500.8);
        double totalBalance = bankaccount.getBalance();
        System.out.println("balance post credit "+ totalBalance);
        bankaccount.debit(200.0);
        System.out.println("balance post debit "+ bankaccount.getBalance());


    }
}