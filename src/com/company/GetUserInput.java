package com.company;

import java.util.Scanner;

/**
 * Created by alexandru on 04.09.2016.
 */
public class GetUserInput {
    public static void main(String[] args) {
        //Create scanner object
        Scanner input = new Scanner(System.in);
        //Output prompt to enter text
        System.out.println("Enter a line of text: ");
        //Wait for user to enter a line of text
        String line = input.nextLine();
        //Tell the user what he entered
        System.out.println("You entered: "+ line);
    }
}
