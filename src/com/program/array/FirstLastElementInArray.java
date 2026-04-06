package com.program.array;

import java.util.ArrayList;
import java.util.List;

/**
 * This program demonstrates how to retrieve the first and last elements from a List.
 * 
 * --- DRY RUN (Example: {10, 20, 30}) ---
 * numbers = [10, 20, 30]
 * size = 3
 * 
 * 1. first = numbers.get(0) -> index 0 is 10.
 * 2. last = numbers.get(size - 1) -> index 2 is 30.
 * 
 * Final Output: 10, 30
 */
public class FirstLastElementInArray {

    public static void main(String[] args) {
        
        // 1. Initialize an ArrayList to store integers
        List<Integer> numbers = new ArrayList<>();
        
        // 2. Add elements to the list sequentially
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // 3. Retrieve the first element at index 0
        int first = numbers.get(0);
        
        // 4. Retrieve the last element using (size - 1) as the index
        int last = numbers.get(numbers.size() - 1);

        // 5. Print the retrieved elements to the console
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);
    }
}
