package com.company;

public class FibonacciWithoutRecursion {

    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;
        int n3;
        int count = 10;

        System.out.println(n1 + " " + n2);//printing 0 and 1

        for (int i = 2; i < count; i++){

            n3 = n1 + n2;
            System.out.println("fib " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}
