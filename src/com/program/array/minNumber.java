package com.program.array;

/*
    PROGRAM: FIND MINIMUM NUMBER IN AN ARRAY

    This program finds the minimum number in a given integer array.

    APPROACH:
    1. Initialize `min` with the first element of the array.
    2. Iterate through the array from index 0 to the last index.
    3. If the current element is smaller than `min`, update `min`.
    4. After the loop, print the minimum number.

    TIME COMPLEXITY: O(n) - Each element is checked once.
    SPACE COMPLEXITY: O(1) - No extra space used.
*/
public class minNumber {

    public static void main(String[] args) {

        int[] numbers = {5, 10, 3, 8, 15, 7};

        int min = numbers[0];
        int max = numbers[0];

        for (int i=0; i<numbers.length; i++) {
            if (numbers[i]< min) {
                min = numbers[i];
            } else if (numbers[i]> max) {
                max = numbers[i];
            }
        }
        // Step 5: Print the minimum number
        System.out.println("Minimum number: " + min);
        System.out.println("Minimum number: " + max);
    }
}
