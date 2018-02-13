package com.constructors;


public class VipCustomer {

    public String name;
    public double creditLimit;
    public String email;

    public VipCustomer() {
        this("default vip name", 100.0, "defaultvip@gmail.com");

    }

    public VipCustomer(String name, double creditLimit) {

        this(name, creditLimit, "unknown@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {

        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
