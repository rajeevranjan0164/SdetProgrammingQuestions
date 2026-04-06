package com.program.string;

/**
 * This program moves all '0' characters in a numeric string to the very end.
 * 
 * --- DRY RUN (Example: "1020") ---
 * Input: "1020"
 * 1. Process '1': Goes to nonZeroDigits -> "1"
 * 2. Process '0': Goes to zeroDigits -> "0", zeroCount = 1
 * 3. Process '2': Goes to nonZeroDigits -> "12"
 * 4. Process '0': Goes to zeroDigits -> "00", zeroCount = 2
 * 5. Final Output: "12" + "00" = "1200"
 */
public class MovingLeadingZerosToTheEnd {

    public static void main(String[] args) {

        // 1. Declare the input string
        String input = "32400121200";

        // 2. StringBuilder to store characters that are NOT '0'
        StringBuilder nonZeroDigits = new StringBuilder();
        
        // 3. StringBuilder to store all the '0' characters
        StringBuilder zeroDigits = new StringBuilder();

        // 4. Counter to keep track of how many zeros we found
        int zeroCount = 0;

        // 5. Iterate through each character in the input string
        for (char chr : input.toCharArray()) {
            
            // 6. If the character is '0'
            if (chr == '0') {
                // 7. Add it to the zeros collection and increment our counter
                zeroDigits.append(chr);
                zeroCount++;
            } else {
                // 8. If character is NOT '0', add it to the non-zero collection
                nonZeroDigits.append(chr);
            }
        }
        
        // 9. Concatenate the two collections and print the result
        System.out.println("Formatted String: " + nonZeroDigits.toString() + zeroDigits.toString());
        System.out.println("Total Zeros Found: " + zeroCount);
    }
}
