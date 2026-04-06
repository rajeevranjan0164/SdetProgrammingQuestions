package com.program.array;

/**
 * PROGRAM: FIND MINIMUM (AND MAXIMUM) NUMBER IN AN ARRAY
 * 
 * This program identifies the smallest and largest values within an integer array.
 * 
 * APPROACH:
 * 1. Initialize `min` and `max` with the first element of the array.
 * 2. Iterate through the array starting from index 0.
 * 3. In each step, check if the current element is smaller than `min` or larger than `max`.
 * 4. Update `min` or `max` if their respective conditions are met.
 * 
 * DRY RUN:
 * Input Array: {5, 10, 3, 8, 15, 7}
 * | Step | i | numbers[i] | numbers[i] < min | numbers[i] > max | min | max |
 * |------|---|------------|------------------|------------------|-----|-----|
 * | Init | - | -          | -                | -                | 5   | 5   |
 * | 1    | 0 | 5          | 5 < 5 (F)        | 5 > 5 (F)        | 5   | 5   |
 * | 2    | 1 | 10         | 10 < 5 (F)       | 10 > 5 (T)       | 5   | 10  |
 * | 3    | 2 | 3          | 3 < 5 (T)        | -                | 3   | 10  |
 * | 4    | 3 | 8          | 8 < 3 (F)        | 8 > 10 (F)       | 3   | 10  |
 * | 5    | 4 | 15         | 15 < 3 (F)       | 15 > 10 (T)      | 3   | 15  |
 * | 6    | 5 | 7          | 7 < 3 (F)        | 7 > 15 (F)       | 3   | 15  |
 */
public class MinNumber {

    public static void main(String[] args) {
        // Line 1: Declare and initialize an integer array with sample values
        int[] numbers = {5, 10, 3, 8, 15, 7};

        // Line 2: Initialize the variable 'min' with the first element of the array
        int min = numbers[0];
        
        // Line 3: Initialize the variable 'max' with the first element of the array
        int max = numbers[0];

        // Line 4: Start a 'for' loop to iterate through the array using index 'i' from 0 to length-1
        for (int i = 0; i < numbers.length; i++) {
            
            // Line 5: Check if the element at the current index 'i' is less than the current 'min'
            if (numbers[i] < min) {
                
                // Line 6: If true, update 'min' to the value of the current element
                min = numbers[i];
            } 
            
            // Line 7: If the current element was not smaller than 'min', check if it is greater than 'max'
            else if (numbers[i] > max) {
                
                // Line 8: If true, update 'max' to the value of the current element
                max = numbers[i];
            }
        } // Line 9: Closing brace for the for loop
        
        // Line 10: Print the final minimum value to the console
        System.out.println("Minimum number: " + min);
        
        // Line 11: Print the final maximum value to the console
        System.out.println("Maximum number: " + max);
        
    } // Line 12: Closing brace for the main method
} // Line 13: Closing brace for the class
