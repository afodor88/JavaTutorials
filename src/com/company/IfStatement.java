package com.company;

/**
 * Created by alexandru on 04.09.2016.
 */
public class IfStatement {
    public static void main(String[] args) {
        int myInt = 5;
        if (myInt < 4) {
            System.out.println("Yes it is!");
        } else if (myInt < 5) {
            System.out.println("Not it is not");
        } else {
            System.out.println("None of the above");
        }
    }
}
