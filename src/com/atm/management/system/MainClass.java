package com.atm.management.system;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        AtmOperationInterface atmOperationImplementation = new AtmOperationImplementation();
        String atmNumber = "5432-8765-7634-6823";
        int atmPin = 6543;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!! ");
        System.out.println("Enter ATM Number : ");
        String inputAtmNumber = in.next();
        System.out.println(inputAtmNumber);
        System.out.print("Enter PIN Number : ");
        int inputAtmPinNumber = in.nextInt();
        if((inputAtmNumber.equalsIgnoreCase(atmNumber))&&(inputAtmPinNumber==atmPin)){
            //System.out.println("Validation Done");
            while (true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.deposit Amount\n4.View Ministatement\n5.Exit");
                System.out.println("Enter Choice : ");
                int ch=in.nextInt();

              switch (ch){
                  case 1:
                      atmOperationImplementation.viewBalance();
                      break;
                  case 2:
                      System.out.println("Enter Amount to Withdraw : ");
                      double withdrawAmount = in.nextInt();
                      atmOperationImplementation.withdrawAmount(withdrawAmount);
                      break;
                  case 3:
                      System.out.println("Enter Amount to Deposit : ");
                      double depositAmount = in.nextInt();
                      atmOperationImplementation.depositAmount(depositAmount);
                      break;
                  case 4:
                      atmOperationImplementation.viewMiniStatement();
                      break;
                  case 5:
                      System.out.println("Collect your AIM card\n Thank you for using ATM Machine !!! ");
                      System.exit(0);
                      break;
                  default :
                      System.out.println("Please Enter the correct choice ");
              }
            }
        }
        else {
            System.out.println("Incorrect Atm and Pin ");
        }
    }
}
