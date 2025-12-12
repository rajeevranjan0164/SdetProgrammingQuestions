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

        // Iterate through each character of the string
        // Check if the character is a letter and then if it's a vowel


        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {

                if (vowels.indexOf(ch) != -1)
                    System.out.println("Found vowel: " + ch); // Print if the character is a vowel.
                // If the character is a letter but not a vowel, print that it's not a vowel.
                else
                    System.out.println(ch + " is not a vowel.");
                }
            }
        }
    }
