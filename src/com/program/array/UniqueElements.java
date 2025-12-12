package com.program.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueElements {

    /**
     * This program demonstrates how to find unique elements in an array.
     * A unique element is defined as an element that appears exactly once in the array.
     */
    public static void main(String[] args) {

        int[] array = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};

        Map<Integer, Integer> countMap = new HashMap<>();

        // Iterate through the array and count the occurrences of each element.
        // The HashMap stores the element as the key and its count as the value.

        for (int array1 : array) {
            countMap.put(array1, countMap.getOrDefault(array1, 0) + 1);
        }

        System.out.println("Unique elements (appearing exactly once):");

        // Iterate through the entry set of the HashMap.
        // For each entry, check if its value (count) is equal to 1.
        // If the count is 1, it means the element appeared exactly once, so print the key (element).

        for (Map.Entry<Integer, Integer> mapEntry : countMap.entrySet()) {
            if (mapEntry.getValue() == 1) {
                System.out.println(mapEntry.getKey());
            }
        }
    }
}
