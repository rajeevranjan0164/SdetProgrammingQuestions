package com.program.array;


/*
Algorithm Explanation:
1. Calculate the sum of numbers from 1 to n using the formula: n*(n+1)/2
2. Compute the sum of elements in the given array.
3. Subtract the sum of the array from the total sum of numbers from 1 to n.
4. The result will be the missing number.

Time Complexity: O(n)  -> Single loop iteration to calculate sum.
Space Complexity: O(1) -> Only a few integer variables are used.
*/
public class missingNumber {

    public static void main(String[] args) {
        // Step 1: Define the array and the expected range
        int[] nums = {1, 2, 4, 5, 6};;
        int n =nums.length+1; // The sequence should contain numbers from 1 to 8

        // Step 4: Compute the sum of numbers from 1 to n using formula
        int totalSum = n * (n + 1) / 2;

        int sum = 0;
        // Step 5: Calculate the sum of elements present in the array
        for (int num : nums) {
            sum = sum + num;
        }

        int missingNumber = totalSum - sum;

        // Step 3: Print the missing number
        System.out.println("Missing number: " + missingNumber);
    }
}
