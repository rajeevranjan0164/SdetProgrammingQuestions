package com.program.array;

/**
 * PROGRAM: LINEAR SEARCH IN AN ARRAY
 * 
 * --- DRY RUN (Example: {5, 2, 9}, target = 2) ---
 * array = {5, 2, 9}, target = 2, length = 3
 * 
 * Iteration 0: i = 0
 * - array[0] (5) == target (2) -> false
 * 
 * Iteration 1: i = 1
 * - array[1] (2) == target (2) -> true
 * - Action: Print index 1
 * 
 * Iteration 2: i = 2
 * - array[2] (9) == target (2) -> false
 * 
 * Final Output: 1
 */
public class LinearSearch {

    public static void main(String[] args) {

        // 1. Initialize an integer array with some values
        int[] array = {5, 2, 9, 1, 6, 3};
        
        // 2. Define the target value to search for in the array
        int target = 6;

        // 3. Start a 'for' loop to iterate through each index 'i' of the array
        for (int i = 0; i < array.length; i++) {
            
            // 4. Check if the element at the current index 'i' is equal to the target value
            if (array[i] == target) {
                
                // 5. If a match is found, print the index 'i' to the console
                System.out.println("Target found at index: " + i);
                
            } // 6. End of 'if' block
        } // 7. End of 'for' loop
        
    } // 8. Closing brace for the main method
} // 9. Closing brace for the class
