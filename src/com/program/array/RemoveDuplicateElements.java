package com.program.array;

import java.util.HashSet; // Import HashSet class to store unique elements
import java.util.Set;     // Import Set interface

/**
 * PROGRAM: REMOVE DUPLICATE ELEMENTS FROM AN ARRAY
 * 
 * --- DRY RUN (Example: {1, 2, 2, 1}) ---
 * Input Array: {1, 2, 2, 1}
 * uniqueElements = {}
 * 
 * Iteration 0: arr1 = 1
 * - Action: uniqueElements.add(1) -> Success!
 * - uniqueElements = {1}
 * 
 * Iteration 1: arr1 = 2
 * - Action: uniqueElements.add(2) -> Success!
 * - uniqueElements = {1, 2}
 * 
 * Iteration 2: arr1 = 2
 * - Action: uniqueElements.add(2) -> Ignored (Already exists)
 * - uniqueElements = {1, 2}
 * 
 * Iteration 3: arr1 = 1
 * - Action: uniqueElements.add(1) -> Ignored (Already exists)
 * - uniqueElements = {1, 2}
 * 
 * Final Output: [1, 2]
 */
public class RemoveDuplicateElements {

    public static void main(String[] args) {

        // 1. Initialize an integer array with some duplicate values
        int[] arr = {1, 2, 3, 4, 5, 2, 7, 8, 1};

        // 2. Create a HashSet to store unique elements (Sets automatically prevent duplicates)
        Set<Integer> uniqueElements = new HashSet<>();

        // 3. Start a 'for-each' loop to iterate through each element 'arr1' in the array 'arr'
        for (int arr1 : arr) {

            // 4. Try adding the current element to the HashSet
            // If the element is new, it's added; if it's already there, it's ignored.
            uniqueElements.add(arr1);
            
        } // 5. End of loop after checking all elements

        // 6. Print the set containing only the unique elements (duplicates are now gone)
        System.out.println("Unique elements: " + uniqueElements);
        
    } // 7. Closing brace for the main method
} // 8. Closing brace for the class
