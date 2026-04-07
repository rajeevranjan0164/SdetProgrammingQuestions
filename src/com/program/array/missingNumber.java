package com.program.array;

/**
 * PROGRAM: FIND THE MISSING NUMBER IN A SEQUENCE (1 to N)
 * 
 * --- DRY RUN (Example: {1, 2, 4}, N should be 4) ---
 * Input Array: {1, 2, 4}, Array length = 3
 * Expected Count (n) = length + 1 = 4
 * 
 * 1. Calculate Expected Total Sum (1 + 2 + 3 + 4):
 *    - totalSum = n * (n + 1) / 2 = 4 * (5) / 2 = 10
 * 
 * 2. Calculate Actual Sum of elements in array:
 *    - sum = 1 + 2 + 4 = 7
 * 
 * 3. Find Missing Number:
 *    - missingNumber = totalSum - sum = 10 - 7 = 3
 * 
 * Final Output: Missing number: 3
 */
public class MissingNumber {

    public static void main(String[] args) {
        
        // 1. Define an array that is missing one number in its sequence
        int[] nums = {1, 2, 4, 5, 6};
        
        // 2. Determine what 'n' should be (the total count of numbers if none were missing)
        // Since one number is missing, n is the array length + 1
        int n = nums.length + 1; 

        // 3. Calculate the sum of all numbers from 1 to 'n' using the formula: n*(n+1)/2
        int totalSum = n * (n + 1) / 2;

        // 4. Initialize 'sum' to zero to calculate the total of the numbers we actually have
        int sum = 0;
        
        // 5. Start a 'for-each' loop to add up every number currently in the 'nums' array
        for (int num : nums) {
            
            // 6. Add the current number to the running total 'sum'
            sum = sum + num;
            
        } // 7. End of loop

        // 8. The missing number is the difference between the expected total and the actual sum
        int missingNumber = totalSum - sum;

        // 9. Print the missing number to the console
        System.out.println("Missing number: " + missingNumber);
        
    } // 10. Closing brace for the main method
} // 11. Closing brace for the class
