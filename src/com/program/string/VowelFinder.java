package com.program.string;

/**
 * This class demonstrates how to find vowels in a given string.
 */
public class VowelFinder {

    public static void main(String[] args) {
        String str = "Hello World!";

        // Convert the string to lower case to handle both upper and lower case vowels
        str = str.toLowerCase();

        // Define vowels string for easy lookup
        String vowels = "aeiout";

        // Iterate through each character of the string
        for (char ch : str.toCharArray()) {
            // Check if the character is a letter first
            if (Character.isLetter(ch)) {
                // indexOf(ch) returns the position of 'ch' in 'vowels'. 
                // If it's not found, it returns -1.
                if (vowels.indexOf(ch) != -1) {
                    System.out.println("Found vowel: " + ch);
                } 
                // If it's a letter but not in the "aeiou" string, it's a consonant.
                else {
                    System.out.println(ch + " is not a vowel."+ch);
                }
            }
        }
    }
}
