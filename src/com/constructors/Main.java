package com.constructors;

public class Main {

    public static void main(String[] args) {

        Account myAccount = new Account();
        System.out.println(myAccount.getName());
        System.out.println(myAccount.getBalance());

        myAccount.withdraw(2000);

        myAccount.deposit(1000);
        myAccount.withdraw(1001);

        Account secondAccount = new Account("Ion", "ion@gmail.com", "0724213213");
        System.out.println(secondAccount.getBalance());

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        System.out.println(person1.getCreditLimit());
        System.out.println(person1.getEmail());

        VipCustomer person2 = new VipCustomer("Gheorghe", 1000);
        System.out.println(person2.getName());
        System.out.println(person2.getCreditLimit());
        System.out.println(person2.getEmail());

        VipCustomer person3 = new VipCustomer("Ilie", 20, "ilie@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getCreditLimit());
        System.out.println(person3.getEmail());



    }
}
