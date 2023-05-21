package com.xworkz.bankapp;
import java.util.Scanner;
public class BankTester {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter BankId:");
        int bankId=sc.nextInt();
        System.out.println("Enter accountNo:");
        long accountNo= sc.nextLong();
        System.out.println("Enter branchNo:");
        String branchNo= sc.next();
        System.out.println("Enter accountType:");
        String accountType=sc.next();
        System.out.println("Enter ifscCode:");
        String ifscCode= sc.next();
        System.out.println("Enter location:");
        String location=sc.next();
        Bank bank=new Bank();
        bank.setBankId(bankId);
        bank.setAccountNo(accountNo);
        bank.setBranchNo(branchNo);
        bank.setAccountType(accountType);
        bank.setIfscCode(ifscCode);
        bank.setLocation(location);
        System.out.println(bank.getBankId()+"\n"+bank.getAccountNo()+"\n"+bank.getBranchNo()+"\n"+bank.getAccountType()+"\n"+bank.getIfscCode()+"\n"+bank.getLocation());
    }

}
