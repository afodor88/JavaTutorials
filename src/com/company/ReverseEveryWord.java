package com.company;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseEveryWord
{
    public static String reverseWords(final String original)
    {

        // Have at it

        Pattern p = Pattern.compile("^[\\s]+$");
        Matcher m = p.matcher(original);
        boolean b = m.matches();

        if(b){
            return original;
        }
        String[] splitted = original.split("\\s");
        String newWord = "";

        for (int i = 0; i < splitted.length; i++){
            char[] wordArray = splitted[i].toCharArray();

            for (int j = wordArray.length - 1; j >= 0; j--){

                newWord += wordArray[j];

            }
            newWord += " ";
        }


        return newWord.trim();

    }
    public static void main(String[] args) {

        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
    }

}
