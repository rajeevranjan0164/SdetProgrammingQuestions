package com.program.string;

public class CountTheNumberWordsString {

    public static void main(String[] args) {

        /**
         * This program counts the number of words in a given string.
         * It uses the split() method to separate words based on whitespace.
         */
        String str = "Test Automation Java Automation"; // Input string example

        // Trim leading/trailing whitespace and split the string by one or more whitespace characters
        String[] strArray = str.trim().split("\\s+");

        // Get the length of the array, which represents the number of words
        int len = strArray.length;

        // Print the total number of words
        System.out.println(len);
    }
}
