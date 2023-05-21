package com.xworkz.bankapp;

public class Bank {
  private int bankId;
  private long  accountNo;
   private String branchNo;
  private String  accountType;
   private String ifscCode;
  private String  location;

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public int getBankId() {
        return bankId;
    }
    public void setAccountNo(long accountNo){
        this.accountNo=accountNo;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }

    public String getBranchNo() {
        return branchNo;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return accountType;
    }
    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }
    public String getIfscCode() {
        return ifscCode;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
}
