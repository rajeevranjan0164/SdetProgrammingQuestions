package com.program.string;

/**
 * This class demonstrates how to find vowels in a given string.
 */
public class VowelFinder {

    public static void main(String[] args) {
        String str = "Hello World!";

        // Convert the string to lower case to handle both upper and lower case vowels
        str = str.toLowerCase();

        // Define vowels
        String vowels = "aeiou";

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1)
                    System.out.println(ch + " is a vowel.");
                else
                    System.out.println(ch + " is not a vowel.");
                }
            }
        }
    }
