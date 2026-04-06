package com.program.array;

import java.util.HashSet; // Import HashSet class to store unique elements
import java.util.Set;     // Import Set interface

/**
 * PSEUDO CODE: FIND DUPLICATE ELEMENTS IN AN ARRAY
 * 
 * --- DRY RUN (Example: {8, 2, 8}) ---
 * Input Array: {8, 2, 8}
 * 
 * Iteration 1: int1 = 8
 * - uniqueNumbers.add(8) -> true (8 added to uniqueNumbers)
 * - uniqueNumbers = {8}, duplicateNumbers = {}
 * 
 * Iteration 2: int1 = 2
 * - uniqueNumbers.add(2) -> true (2 added to uniqueNumbers)
 * - uniqueNumbers = {8, 2}, duplicateNumbers = {}
 * 
 * Iteration 3: int1 = 8
 * - uniqueNumbers.add(8) -> false (8 already exists!)
 * - duplicateNumbers.add(8) -> true (8 added to duplicateNumbers)
 * - uniqueNumbers = {8, 2}, duplicateNumbers = {8}
 * 
 * Final Output: [8]
 */
public class KeepDuplicateElements {

    public static void main(String[] args) {
        
        // 1. Initialize an integer array with some duplicate values
        int[] arr = {8, 2, 3, 4, 5, 2, 7, 8, 1};

        // 2. Create a HashSet to store unique numbers encountered so far
        Set<Integer> uniqueNumbers = new HashSet<>();

        // 3. Create another HashSet to store numbers that are found to be duplicates
        Set<Integer> duplicateNumbers = new HashSet<>();

        // 4. Start a 'for-each' loop to iterate through each element 'int1' in the array 'arr'
        for (int int1 : arr) {
            
            // 5. uniqueNumbers.add(int1) returns true if the element was successfully added (wasn't present)
            // 6. If it returns false (using '!'), it means the element is already in the set (a duplicate)
            if (!uniqueNumbers.add(int1)) {
                
                // 7. If the element is a duplicate, add it to the 'duplicateNumbers' set
                duplicateNumbers.add(int1);
            }
        } // 8. Loop completes after checking all elements in the array
        
        // 9. Print the final set of duplicate numbers found in the array to the console
        System.out.println("Duplicate elements: " + duplicateNumbers);
        
    } // 10. Closing brace for main method
} // 11. Closing brace for class
