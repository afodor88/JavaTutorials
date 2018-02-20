package com.constructors;

public class Account {

    public String accountNumber;
    public double balance;
    public String name;
    public String email;
    public String phone;

    public Account() {
        this("Default name", "Default email", "0723999999");
        System.out.println("default constructor called");

    }

    public Account(String name, String email, String phone) {
        this("1234", 1.0, name, email, phone);
        System.out.println("2nd constructor called");
    }


    public Account(String accountNumber, double balance, String name, String email, String phone) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
        System.out.println("constructor with parameters called");
    }



    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Balance after deposit: " + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Insufficient funds: " + this.balance + ". Try a lower amount to withdraw.");
        } else {
            this.balance -= amount;
            System.out.println("Balance after withdraw: " + this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
