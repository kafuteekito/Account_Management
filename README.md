# PersonalAccount Banking System

This Java project simulates a simple banking system that allows users to create personal accounts, deposit and withdraw money, and view transaction history.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Usage](#usage)
- [Example Output](#example-output)
- [Classes and Methods](#classes-and-methods)
- [License](#license)

## Overview
This project provides a basic implementation of a personal banking system. It allows users to manage a personal account, deposit and withdraw money, and track all transactions (deposits and withdrawals).

## Features
- **Create a personal bank account** with a unique account number and account holder's name.
- **Deposit money** into the account.
- **Withdraw money** from the account (with balance checks).
- **Print transaction history** (shows transaction type and amount).
- **Retrieve account details** such as account number, account holder's name, and current balance.

## Usage
The program allows you to perform the following operations:
- Create a `PersonalAccount` object with a unique account number and account holder name.
- Use the `deposit` method to add money to the account.
- Use the `withdraw` method to withdraw money from the account, ensuring the account has enough balance.
- Use the `printTransactionHistory` method to view the list of all transactions.
- Retrieve account details like the current balance, account holder name, and account number using getters.

## Example Output

Here’s an example of what you will see when running the program:

```text
Deposited some money to account: Mark Twain
Deposited 200.0 to Mark Twain
Deposited 50.5 to Mark Twain
Invalid deposit amount.

Spent some money from account: Mark Twain
Withdrawn 20.0 from Mark Twain
Withdrawn 100.11 from Mark Twain
You don't have enough balance to withdraw.

History of transactions:
Transaction type: DEPOSIT, Amount: 200.0
Transaction type: DEPOSIT, Amount: 50.5
Transaction type: WITHDRAWAL, Amount: 20.0
Transaction type: WITHDRAWAL, Amount: 100.11

Current Balance: 130.39 for Account Mark Twain with number 1
```

## Classes and Methods

### 1. `TransactionType` Enum
Defines the types of transactions:
- `DEPOSIT`: Represents a deposit transaction.
- `WITHDRAWAL`: Represents a withdrawal transaction.

### 2. `Amount` Class
Represents a transaction with two fields:
- `amount` (double): The transaction amount.
- `transactionType` (TransactionType): An enum indicating if the transaction is a deposit or withdrawal.

#### Methods:
- `Amount(double amount, TransactionType transactionType)`: Constructor to initialize the amount and transaction type.
- `toString()`: Provides a string representation of the transaction for easy output.

### 3. `PersonalAccount` Class
Represents a personal bank account with the following fields:
- `accountNumber` (int): Unique identifier for the account.
- `accountHolder` (String): The name of the account holder.
- `balance` (double): The current balance in the account.
- `transactions` (ArrayList<Amount>): Stores the list of transactions.

#### Methods:
- `PersonalAccount(int accountNumber, String accountHolder)`: Constructor to initialize the account and set the balance to `0.0`.
- `void deposit(double amount)`: Method to deposit money into the account and update the balance.
- `void withdraw(double amount)`: Method to withdraw money if the balance is sufficient.
- `void printTransactionHistory()`: Displays the transaction history.
- `double getBalance()`: Returns the current balance of the account.
- `int getAccountNumber()`: Returns the account number.
- `String getAccountHolder()`: Returns the account holder's name.
