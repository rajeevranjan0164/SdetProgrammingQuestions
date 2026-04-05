package com.program.string;

public class StringLengthWithoutMethodUsingToCharArray {

    /**
     * This program demonstrates how to calculate the length of a string 
     * without using the built-in .length() method.
     */
    public static void main(String[] args) {
        String str = "Automation";
        
        // 1. Convert the string to a character array
        char[] characters = str.toCharArray();

        // 2. Initialize a counter to manually track the number of characters
        int length = 0;

        // 3. Iterate through the array; increment the counter for each character found
        for (char ch : characters) {
            length++;
        }

        // 4. Print the final results
        System.out.println("Original String: " + str);
        System.out.println("Calculated Length: " + length);
    }
}
