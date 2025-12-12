package com.program.string;

public class VowelFinder {

    public static void main(String[] args) {
        String str = "Hello World!";
        findVowels(str);
    }

    public static void findVowels(String str) {
        // Convert the string to lower case to handle both upper and lower case vowels
        str = str.toLowerCase();

        // Define vowels
        String vowels = "aeiouefef";

        /*
            A string containing all vowel characters. Example: "aeiou".
            indexOf(ch):

            This method checks if the character ch exists in the string vowels.
            If ch is found, indexOf(ch) returns the index of the first occurrence of ch in vowels.
            If ch is not found, indexOf(ch) returns -1.
            != -1:

This condition checks whether the character ch exists in vowels.

        * */

        char[] chr = str.toCharArray();

        // Iterate through the string
        for (char ch : chr) {
            // Check if the character is a letter
            if (Character.isLetter(ch)) { // Check if the character is a letter
                if (vowels.indexOf(ch) != -1) {
                    System.out.println(ch + " is a vowel.");
                } else {
                    System.out.println(ch + " is not a vowel.");
                }
            }
        }
    }
}
