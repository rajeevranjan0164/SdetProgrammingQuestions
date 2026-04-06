package com.program.array;

import java.util.ArrayList;
import java.util.List;

/**
 * This program reverses an integer array and stores the result in an ArrayList.
 * 
 * --- DRY RUN (Example: {1, 2, 3}) ---
 * numArray = {1, 2, 3}, length = 3
 * list = []
 * 
 * 1. i = 2: numArray[2] is 3. list.add(3) -> list: [3]
 * 2. i = 1: numArray[1] is 2. list.add(2) -> list: [3, 2]
 * 3. i = 0: numArray[0] is 1. list.add(1) -> list: [3, 2, 1]
 * 
 * Final Output: [3, 2, 1]
 */
public class ArrayReverse {

    public static void main(String[] args) {

        // 1. Initialize an integer array with sample values
        int[] numArray = {1, 2, 3, 4, 5};

        // 2. Create an ArrayList to store the elements in reversed order
        List<Integer> list = new ArrayList<>();

        // 3. Loop through the original array starting from the last index (length - 1)
        // Move backwards until index 0 is reached.
        for (int i = numArray.length - 1; i >= 0; i--) {
            
            // 4. Add the element at the current index 'i' to the list
            list.add(numArray[i]);
        }
        
        // 5. Print the final list containing the reversed elements
        System.out.println("Reversed Array: " + list);
    }
}
