# Atm Machine Management System
Project: ATM Machine Simulation in Java
This project is a console-based ATM Machine simulation, where a user can perform various banking operations like balance inquiry, withdrawal, deposit, and viewing a mini statement. It demonstrates Object-Oriented Programming (OOP) concepts such as Encapsulation, Abstraction, and Interface Implementation.

🔹 Project Requirements & Functionalities

Functionalities Provided in the ATM System
View Available Balance – Displays the current balance.
Withdraw Amount – Allows the user to withdraw cash (only in multiples of ₹500).
Deposit Amount – Enables the user to deposit money into their account.
View Mini Statement – Shows the history of transactions (Deposits & Withdrawals).
Exit – Ends the transaction and logs the user out.

Constraints & Validations
Withdrawal is allowed only if the amount is in multiples of ₹500.
Ensures that withdrawal does not exceed the available balance.
Stores and displays mini statements for tracking transactions.
Requires ATM number and PIN validation for security.

🔹 Technologies & Concepts Used
Java (Core Java)


OOP Concepts: Encapsulation, Abstraction, and Interface Implementation.
Collections Framework: Used HashMap<Double, String> for storing mini statements.
Exception Handling: Basic validation for incorrect ATM PIN and insufficient balance.
Loops & Conditional Statements: Used while-loop and if-else statements for menu handling.
Scanner Class (java.util.Scanner)


Takes user input for ATM Number, PIN, withdrawal, and deposit amounts.
HashMap (java.util.HashMap)


Stores the transaction history (mini statement) where:
Key: Transaction amount.
Value: Transaction type (e.g., "Amount Withdrawn" or "Amount Deposited").
Interface (AtmOperationInterface)


Ensures modular & structured code by defining essential ATM operations.

🔹 Project Structure & Explanation
1️. ATM Class (Data Model)
This class maintains user account details, including:
balance – User’s account balance.
depositAmount – Stores the amount to be deposited.
withdrawAmount – Stores the amount to be withdrawn.
Methods:
Getter & Setter Methods to retrieve and update these values.

2️. AtmOperationInterface (Interface)
Defines the essential ATM functionalities:
viewBalance() – Displays the available balance.
withdrawAmount(double withdrawAmount) – Withdraws money (if conditions are met).
depositAmount(double depositAmount) – Deposits money into the account.
viewMiniStatement() – Prints the mini statement of transactions.

3️. AtmOperationImplementation (Implementation Class)
Implements the ATM functionalities defined in AtmOperationInterface.
Methods:

viewBalance() – Prints the current balance.

withdrawAmount(double withdrawAmount)

Checks if withdrawal is in multiples of ₹500.
Ensures withdrawal amount does not exceed balance.
Updates balance and stores transaction details in HashMap.

depositAmount(double depositAmount)
Adds amount to the balance and stores transaction details in HashMap.

viewMiniStatement()
Prints all transactions stored in HashMap.

4️. MainClass (Driver Class)
Handles user interaction and ATM operations.
Key Features:
Validates ATM Number (5432-8765-7634-6823) & PIN (6543)

Displays Menu for Banking Operations

Uses a while(true) loop to keep the ATM running until the user chooses to exit.

Menu Options:
1️.View Available Balance
2.Withdraw Amount
3.Deposit Amount
4️.View Mini Statement
5️.Exit

🔹 Summary
This Java program simulates an ATM machine with basic banking functionalities.
Implements OOP principles, HashMap for transaction storage, and Scanner for user input.
Ensures security via PIN authentication and validates transaction amounts before proceeding.
