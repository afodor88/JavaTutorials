package com.company;



public class PrimeFactorization {


    public static void main(String[] args) {

        long a = 600851475143L;

        for(int i=2; i<(a/i); i++){                         // no factors would exist beyond a/i for a particular i

            while( a%i == 0){                               // if i is a factor
                a = a/i;                                    // divide a by i else we wont get a prime number
                System.out.print(a + " x " + i + "\n");
            }
        }

        if(a > 1)
            System.out.println("largest prime factor: " + a);
    }
}
