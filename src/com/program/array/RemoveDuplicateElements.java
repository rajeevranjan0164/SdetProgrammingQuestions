package com.program.array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElements {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 2, 7, 8, 1};

        /**
         * Using a HashSet to store unique elements.
         */
        Set<Integer> uniqueElements = new HashSet<>();

        /*
         * Iterate through the array
         * - HashSet does not allow duplicate values.
         * - When we try to add an element that already exists, it is ignored.
         * - The order of elements in HashSet is NOT maintained.
         */

        /**
         * Add elements from the array to the HashSet.
         */
        for (int arr1 : arr) {

            uniqueElements.add(arr1);
        }
        // Print unique elements (duplicates are removed)
        System.out.println(uniqueElements);
    }

}
