package com.atm.management.system;

public class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    //default consturctor
    public ATM() {

    }

    //getter setter
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getDepositAmount() {
        return balance;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount=depositAmount;
    }
    public double getWithdrawAmount() {
        return balance;
    }

    public void setWithdrawAmount(double withdrawAmount){
        this.withdrawAmount=withdrawAmount;
    }
}