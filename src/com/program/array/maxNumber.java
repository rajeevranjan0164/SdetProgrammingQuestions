package com.program.array;

/*
    PROGRAM: FIND MAXIMUM NUMBER IN AN ARRAY

    This program finds the maximum number in a given integer array.

    APPROACH:
    1. Initialize `max` with the first element of the array.
    2. Iterate through the array from index 0 to the last index.
    3. If the current element is greater than `max`, update `max`.
    4. After the loop, print the maximum number.

    TIME COMPLEXITY: O(n) - Each element is checked once.
    SPACE COMPLEXITY: O(1) - No extra space used.
*/
public class maxNumber {

    public static void main(String[] args) {

        int[] numbers = {5, 10, 3, 8, 15, 7};

        int max = numbers[0];

        for (int i = 0; i<numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
