package com.program.string;


public class StringLenthwithoutMethodUsingToCharArray {

    /**
     * This method calculates the length of a string without using the `length()` method,
     * by iterating over its characters obtained from `toCharArray()`.
     */
    public static void main(String[] args) {
        String str = "Automation";

        /**
         * Initialize a counter to keep track of the string's length.
         * This counter will be incremented for each character in the string.
         */
        int count =0;

        /**
         * Iterate through each character of the string using a for-each loop.
         */
        for (char ch : str.toCharArray()) {
        /**
         * Increment the counter for each character encountered.
         */

            count++;
        }
        System.out.println(count);
    }
}
