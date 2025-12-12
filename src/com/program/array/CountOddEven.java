package com.program.array;

/**
 * This class demonstrates how to count the number of odd and even elements in an integer array.
 */
public class CountOddEven {

    /**
     * The main method is the entry point of the program.
     * It initializes an array, then iterates through it to count odd and even numbers,
     * and finally prints the counts to the console.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Initialize an integer array with some sample values.
        // This array will be used to count odd and even numbers.

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Initialize counters for odd and even numbers to zero.
        // These variables will store the total count of odd and even elements found in the array.

        int oddCount = 0, evenCount = 0;


        // Iterate through the array to check each element
        // If an element is divisible by 2, it's even; otherwise, it's odd.
        // Increment the respective counter.

        for (int i=0; i<array.length;i++) {
            if (array[i] % 2== 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}
