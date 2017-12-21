package com.company;

public class ReverseString {

    private static String reverse(String input){
        char[] charList = input.toCharArray();

        int begin = 0;
        int end = charList.length - 1;
        char temp;

        while (end > begin){

            temp = charList[begin];
            charList[begin] = charList[end];
            charList[end] = temp;
            end--;
            begin++;
        }

        return new String(charList);

    }

    public static void main(String[] args) {

        //System.out.println(reverse(args[0]));  When running the file to send the input as an argument
        System.out.println(reverse("abc"));
    }

}

