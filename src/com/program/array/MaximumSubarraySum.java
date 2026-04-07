package com.program.array;

/**
 * PROGRAM: KADANE'S ALGORITHM (MAXIMUM SUBARRAY SUM)
 * Goal: Find the largest sum you can get from any continuous section of the array.
 * 
 * --- DRY RUN (Example: {-2, 1, -3, 4}) ---
 * Input: {-2, 1, -3, 4}
 * currentMax = 0, globalMax = MIN_VALUE
 * 
 * 1. num = -2: currentMax = max(-2, 0+(-2)) = -2. globalMax = -2.
 * 2. num = 1:  currentMax = max(1, -2+1) = 1. globalMax = max(-2, 1) = 1.
 * 3. num = -3: currentMax = max(-3, 1-3) = -2. globalMax = 1.
 * 4. num = 4:  currentMax = max(4, -2+4) = 4. globalMax = max(1, 4) = 4.
 * 
 * Final Output: 4
 */
public class MaximumSubarraySum {

    public static void main(String[] args) {
        
        // 1. Initialize an array with positive and negative numbers
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // 2. 'currentMax' tracks the sum of the subarray ending at the current position
        int currentMax = nums[0];
        
        // 3. 'globalMax' stores the highest sum we have seen so far
        int globalMax = nums[0];

        // 4. Start loop from the second element (index 1)
        for (int i = 1; i < nums.length; i++) {
            
            // 5. Decision: Should we start a NEW subarray at 'nums[i]', 
            //    or continue the existing subarray ('currentMax + nums[i]')?
            currentMax = Math.max(nums[i], currentMax + nums[i]);

            // 6. If our new 'currentMax' is better than anything seen before, update 'globalMax'
            if (currentMax > globalMax) {
                globalMax = currentMax;
            }
        } // 7. End of loop

        // 8. Print the maximum subarray sum found
        System.out.println("Maximum Subarray Sum: " + globalMax);
        
    } // 9. Closing brace for main
} // 10. Closing brace for class
