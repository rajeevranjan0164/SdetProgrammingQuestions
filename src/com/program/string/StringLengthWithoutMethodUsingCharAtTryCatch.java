package com.program.string;

/**
 * This program demonstrates an unconventional way to calculate string length
 * by intentionally triggering an IndexOutOfBoundsException to find the end.
 */
public class StringLengthWithoutMethodUsingCharAtTryCatch {

    public static void main(String[] args) {
        String str = "Automation";
        int length = 0;

        try {
            // 1. Start an infinite loop to access characters one by one
            while (true) {
                // 2. Access the character at the current 'length' index
                // This will throw an exception once 'length' reaches the string's actual size
                str.charAt(length);
                
                // 3. If no exception occurred, increment the length and continue
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // 4. The exception is caught here when we go past the last character.
            // At this exact moment, 'length' equals the total number of characters.
        }

        // 5. Print the final results
        System.out.println("Original String: " + str);
        System.out.println("Calculated Length (using try-catch): " + length);
    }
}
