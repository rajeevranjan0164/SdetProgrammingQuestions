package com.program.array;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInTwoArray {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};


        // Create two sets to store elements from array1 and common elements
        Set<Integer> set = new HashSet<>(); // Stores elements from array1 for efficient lookup
        Set<Integer> set1 = new HashSet<>(); // Stores the common elements found

        // Add all elements from array1 to the 'set' for quick checking
        for (int num : array1) {
            set.add(num);
        }
        /**
         * Iterate through the second array.
         * If an element from array2 is present in 'set' (which contains elements from array1), add it to 'set1' (common elements).
         */

        for (int num2 : array2) {
            if (set.contains(num2)) {
                set1.add(num2);
            }
        }
        System.out.println(set1);
    }
}
