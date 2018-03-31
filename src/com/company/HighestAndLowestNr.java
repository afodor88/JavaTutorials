package com.company;

public class HighestAndLowestNr {
    public static String HighAndLow(String numbers) {
        // Code here or
        String[] numbersArray = numbers.split(" ");
        int highest = Integer.parseInt(numbersArray[0]);
        int lowest = Integer.parseInt(numbersArray[0]);



        for(int i = 0; i < numbersArray.length; i++){


            if(highest < Integer.parseInt(numbersArray[i])){
                highest = Integer.parseInt(numbersArray[i]);
            }
            if(lowest > Integer.parseInt(numbersArray[i])){
                lowest = Integer.parseInt(numbersArray[i]);
            }
        }

        return highest + " " + lowest;
    }


    public static void main(String[] args) {
        System.out.println(HighAndLow("4 23 1 4 62 1231"));
    }
}
