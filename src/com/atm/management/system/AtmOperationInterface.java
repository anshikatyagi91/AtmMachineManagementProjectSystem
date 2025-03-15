package com.atm.management.system;

public interface AtmOperationInterface {
    public void viewBalance();
    public void withdrawAmount(double withdrawAmount);
    public void depositAmount(double depositAmount);
    public void viewMiniStatement();

}
