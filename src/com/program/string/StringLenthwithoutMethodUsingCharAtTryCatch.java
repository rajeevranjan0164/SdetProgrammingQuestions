package com.program.string;


/**
 * This class demonstrates how to calculate the length of a string without using
 * the built-in `length()` method, by leveraging a `try-catch` block with `charAt()`.
 * It iterates through the string characters until an `IndexOutOfBoundsException` is caught.
 */
public class StringLenthwithoutMethodUsingCharAtTryCatch {

    public static void main(String[] args) {
        String str = "Automation";

        int length = 0;
        try {
            while (true) {                // Access character at current 'length' to check if it's within bounds

                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // This exception is expected when we reach the end of the string
        }

        System.out.println(length);
    }
}
