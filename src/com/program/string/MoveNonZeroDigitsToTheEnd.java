package com.program.string;

/**
 * This program moves all non-zero digits to the end of the string,
 * effectively placing all zeros at the beginning.
 * 
 * --- DRY RUN (Example: "102") ---
 * Input: "102"
 * 1. Process '1': Goes to nonZero -> "1"
 * 2. Process '0': Goes to zero -> "0"
 * 3. Process '2': Goes to nonZero -> "12"
 * 4. Final Output: "0" + "12" = "012"
 */
public class MoveNonZeroDigitsToTheEnd {

    public static void main(String[] args) {

        // 1. Declare the input string
        String input = "32400121200";

        // 2. StringBuilder to store non-zero characters ('1'-'9')
        StringBuilder nonZero = new StringBuilder();
        
        // 3. StringBuilder to store zero characters ('0')
        StringBuilder zero = new StringBuilder();

        // 4. Iterate through each character in the input string
        for (char chr : input.toCharArray()) {
            
            // 5. If the character is '0'
            if (chr == '0') {
                // 6. Append to the 'zero' collection
                zero.append(chr);
            } else {
                // 7. If character is NOT '0', append to the 'nonZero' collection
                nonZero.append(chr);
            }
        }
        
        // 8. Print zeros first, then non-zeros to satisfy the requirement
        System.out.println("Result (Zeros first, then Non-zeros): " + zero.toString() + nonZero.toString());
    }
}
