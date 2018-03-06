package com.company;

public class ReverseString2 {

    public static String reverse(String word){

    char[] wordArray = word.toCharArray();
    String newWord = "";

    for (int i = wordArray.length - 1; i >= 0; i--){

        newWord += wordArray[i];
    }
        return newWord;
    }


    public static void main(String[] args) {
        System.out.println(reverse("REVERSE THIS"));
    }
}
