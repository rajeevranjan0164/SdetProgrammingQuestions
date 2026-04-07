package com.program.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * PROGRAM: MOVE ALL ZEROS TO THE END OF ARRAY (IN-PLACE)
 * Goal: Move all 0s to the end without changing the relative order of non-zero numbers.
 * 
 * --- DRY RUN (Example: {0, 5, 0}) ---
 * Input Array: {0, 5, 0}, indexToFill = 0
 * 
 * Step 1: Move Non-Zeros
 * - i = 0: nums[0] is 0. Skip.
 * - i = 1: nums[1] is 5 (Not 0). 
 *          Action: nums[indexToFill(0)] = 5. Increment indexToFill to 1.
 *          Array is now: {5, 5, 0}
 * - i = 2: nums[2] is 0. Skip.
 * 
 * Step 2: Fill remaining with Zeros
 * - Current indexToFill is 1. Array length is 3.
 * - Fill index 1 with 0: {5, 0, 0}. Increment indexToFill to 2.
 * - Fill index 2 with 0: {5, 0, 0}. Increment indexToFill to 3.
 * - indexToFill(3) < length(3) is false. Stop.
 * 
 * Final Result: {5, 0, 0}
 */
public class MoveZerosToEnd {

    public static void main(String[] args) {
        
        // 1. Declare and initialize an integer array with mixed zeros and non-zeros
        int[] nums = {0, 1, 9, 0, 0, 8, 3, 0, 2};

        // Store non-zero elements
        List<Integer> nonZero = new ArrayList<>();

        // Store zero elements
        List<Integer> zero = new ArrayList<>();

        for (int num : nums) {
            if (num == 0) {
                zero.add(num);
            } else {
                nonZero.add(num);
            }
        }

            List<Integer> result = new ArrayList<>();

            for (int numTwo : nonZero) {
                result.add(numTwo);
            }

            for (int numTwo : zero) {
                result.add(numTwo);
            }

            System.out.println(result);
        
    }
}
