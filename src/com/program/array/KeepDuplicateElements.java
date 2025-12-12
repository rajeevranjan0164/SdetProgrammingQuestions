package com.program.array;

import java.util.HashSet;
import java.util.Set;

/*
    PSEUDO CODE: FIND DUPLICATE ELEMENTS IN AN ARRAY

    This algorithm identifies duplicate elements in an integer array
    and stores them in a separate set.

    APPROACH:
    1. Use a set (uniqueNumbers) to track the first occurrence of each number.
    2. Use another set (duplicateNumbers) to store numbers that appear more than once.
    3. Iterate through the array:
       - If a number is not in uniqueNumbers, add it.
       - If a number is already in uniqueNumbers, add it to duplicateNumbers.
    4. Print only the duplicate numbers.

    TIME COMPLEXITY: O(n) - Each element is processed once.
    SPACE COMPLEXITY: O(n) - Additional storage for unique and duplicate sets.
*/
public class KeepDuplicateElements {

    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 4, 5, 2, 7, 8, 1};

        /* Step 1: Create two HashSet objects
           - uniqueNumbers: Stores all unique elements
           - duplicateNumbers: Stores only duplicate elements */
        Set<Integer> uniqueNumbers = new HashSet<>();

        Set<Integer> duplicateNumbers = new HashSet<>();

        /* Step 2: Iterate through the array
           - If the number is added to uniqueNumbers successfully, it's the first occurrence.
           - If the number already exists in uniqueNumbers, add it to duplicateNumbers. */
        for (int int1 : arr) {
            if (!uniqueNumbers.add(int1)) {
                duplicateNumbers.add(int1);
            }
        }
        /* Step 3: Print the duplicate numbers */
        System.out.println("Duplicate elements: " + duplicateNumbers);

    }
}
