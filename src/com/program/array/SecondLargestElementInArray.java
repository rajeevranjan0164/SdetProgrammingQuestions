package com.program.array;

/**
 * PROGRAM: FIND SECOND LARGEST ELEMENT IN AN ARRAY
 * 
 * --- DRY RUN (Example: {10, 50, 40}) ---
 * Input Array: {10, 50, 40}
 * largest = MIN, secondLargest = MIN
 * 
 * Iteration 0: numbers[0] = 10
 * - 10 > largest (MIN)? YES!
 * - Action: secondLargest = MIN, largest = 10
 * 
 * Iteration 1: numbers[1] = 50
 * - 50 > largest (10)? YES!
 * - Action: secondLargest = 10, largest = 50
 * 
 * Iteration 2: numbers[2] = 40
 * - 40 > largest (50)? NO.
 * - 40 > secondLargest (10)? YES!
 * - Action: secondLargest = 40
 * 
 * Final Output: Second Largest: 40
 */
public class SecondLargestElementInArray {

    public static void main(String[] args) {

        // 1. Initialize an integer array with sample values
        int[] numbers = {12, 45, 67, 45, 89, 89, 23};

        // 2. Initialize 'largest' and 'secondLargest' to the smallest possible integer value
        int largest = Integer.MIN_VALUE; 
        int secondLargest = Integer.MIN_VALUE; 

        // 3. Start a loop to iterate through each index 'i' of the array
        for (int i = 0; i < numbers.length; i++) {

            // 4. Check if the current number is greater than the current 'largest'
            if (numbers[i] > largest) {
                
                // 5. If it is, the old largest now becomes the 'secondLargest'
                secondLargest = largest; 
                
                // 6. Update 'largest' to the new current number
                largest = numbers[i];
            } 
            // 7. Otherwise, check if current number is smaller than 'largest' BUT larger than 'secondLargest'
            //    We also check (numbers[i] != largest) to handle duplicate values of the maximum
            else if (numbers[i] > secondLargest && numbers[i] != largest) {
                
                // 8. If true, update 'secondLargest' to the current number
                secondLargest = numbers[i];
            }
        } // 9. End of 'for' loop

        // 10. Print the final result found for second largest to the console
        System.out.println("Second Largest: " + secondLargest);
        
    } // 11. Closing brace for main method
} // 12. Closing brace for class
