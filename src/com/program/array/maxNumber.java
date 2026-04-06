package com.program.array;

/**
 * PROGRAM: FIND MAXIMUM NUMBER IN AN ARRAY
 * 
 * --- DRY RUN (Example: {5, 10, 3}) ---
 * numbers = {5, 10, 3}, max = 5 (initially numbers[0])
 * 
 * Iteration 0: i = 0
 * - numbers[0] (5) > max (5) -> false
 * 
 * Iteration 1: i = 1
 * - numbers[1] (10) > max (5) -> true
 * - Action: Update max = 10
 * 
 * Iteration 2: i = 2
 * - numbers[2] (3) > max (10) -> false
 * 
 * Final Output: 10
 */
public class MaxNumber {

    public static void main(String[] args) {
        
        // 1. Initialize an integer array with several values
        int[] numbers = {5, 10, 3, 8, 15, 7};

        // 2. Initialize 'max' with the first element of the array (at index 0)
        int max = numbers[0];

        // 3. Start a loop to iterate through each index 'i' of the array 'numbers'
        for (int i = 0; i < numbers.length; i++) {
            
            // 4. Check if the current element at index 'i' is greater than our current 'max'
            if (numbers[i] > max) {
                
                // 5. If it is greater, update 'max' to be the value of the current element
                max = numbers[i];
            } // 6. End of 'if' block
        } // 7. End of 'for' loop
        
        // 8. After iterating through the entire array, print the maximum value found
        System.out.println("Maximum number: " + max);
        
    } // 9. Closing brace for the main method
} // 10. Closing brace for the class
