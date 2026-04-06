package com.program.array;

import java.util.HashMap; // Import HashMap to store element counts
import java.util.Map;     // Import Map interface

/**
 * PROGRAM: FIND UNIQUE ELEMENTS IN AN ARRAY
 * (Unique elements are those that appear EXACTLY ONCE)
 * 
 * --- DRY RUN (Example: {1, 1, 2}) ---
 * Input Array: {1, 1, 2}
 * countMap = {}
 * 
 * Step 1: Count Occurrences
 * - 1st Loop: current = 1 -> countMap = {1=1}
 * - 1st Loop: current = 1 -> countMap = {1=2}
 * - 1st Loop: current = 2 -> countMap = {1=2, 2=1}
 * 
 * Step 2: Find elements with count == 1
 * - 2nd Loop: key=1, value=2 -> (2==1 is False) -> Skip
 * - 2nd Loop: key=2, value=1 -> (1==1 is True)  -> Print 2
 * 
 * Final Output: 2
 */
public class UniqueElements {

    public static void main(String[] args) {

        // 1. Initialize an integer array with some repeating and some unique values
        int[] array = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};

        // 2. Create a HashMap to store the frequency (count) of each number
        // Key = The number from the array, Value = How many times it appeared
        Map<Integer, Integer> countMap = new HashMap<>();

        // 3. Start a 'for-each' loop to iterate through every 'array1' in the array
        for (int array1 : array) {
            
            // 4. countMap.getOrDefault(array1, 0) gets the current count, or 0 if it's the first time
            // 5. Add 1 to that count and put it back into the map
            countMap.put(array1, countMap.getOrDefault(array1, 0) + 1);
            
        } // 6. End of the first loop

        // 7. Print a message to the console
        System.out.println("Unique elements (appearing exactly once):");

        // 8. Start another loop to iterate through each entry (Key-Value pair) in our countMap
        for (Map.Entry<Integer, Integer> mapEntry : countMap.entrySet()) {
            
            // 9. Check if the value (the count) for the current number is exactly 1
            if (mapEntry.getValue() == 1) {
                
                // 10. If the count is 1, it is a unique element, so print the key (the number)
                System.out.println(mapEntry.getKey());
                
            } // 11. End of 'if' check
        } // 12. End of map iteration loop
        
    } // 13. Closing brace for the main method
} // 14. Closing brace for the class
