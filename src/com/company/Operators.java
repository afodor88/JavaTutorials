package com.company;

public class Operators {


    public static void main(String[] args) {

        double first = 20;
        double second = 80;
        double multiplied = (first + second) * 25;
        System.out.println(multiplied);
        System.out.println((first + second) % 40);


        if((multiplied) % 40 <= 20){

            System.out.println("Total was over the limit");
        }


    }
}