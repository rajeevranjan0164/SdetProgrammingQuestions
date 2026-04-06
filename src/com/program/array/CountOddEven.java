package com.program.array;

/**
 * This program counts the total number of even and odd integers in an array.
 * 
 * --- DRY RUN (Example: {1, 2, 3}) ---
 * array = {1, 2, 3}, length = 3
 * evenCount = 0, oddCount = 0
 * 
 * 1. i = 0 (val=1): (1 % 2 == 0) is FALSE. oddCount becomes 1.
 * 2. i = 1 (val=2): (2 % 2 == 0) is TRUE. evenCount becomes 1.
 * 3. i = 2 (val=3): (3 % 2 == 0) is FALSE. oddCount becomes 2.
 * 
 * Final Output: Even: 1, Odd: 2
 */
public class CountOddEven {

    public static void main(String[] args) {
        
        // 1. Declare and initialize an integer array with sample values
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 2. Initialize counters for odd and even elements
        int oddCount = 0;
        int evenCount = 0;

        // 3. Start a loop to iterate through every index of the array
        for (int i = 0; i < array.length; i++) {
            
            // 4. Check if the current element is divisible by 2 (even check)
            if (array[i] % 2 == 0) {
                // 5. If remainder is 0, increment the even counter
                evenCount++;
            } else {
                // 6. If remainder is not 0, increment the odd counter
                oddCount++;
            }
        }
        
        // 7. Print the final calculated counts to the console
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}
