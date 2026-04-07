package com.program.array;

/**
 * PROGRAM: SORT ARRAY IN DESCENDING ORDER WITHOUT USING Arrays.sort()
 * (Uses a nested loop to sort elements from Largest to Smallest)
 * 
 * --- DRY RUN (Example: {2, 5, 9}) ---
 * Input Array: {2, 5, 9}
 * 
 * Pass 1 (i = 0):
 * - i=0, j=1: arr[0](2) < arr[1](5)? YES!
 *   Action: Swap 2 and 5 -> {5, 2, 9}
 * - i=0, j=2: arr[0](5) < arr[2](9)? YES!
 *   Action: Swap 5 and 9 -> {9, 2, 5}
 * >> Result after Pass 1: {9, 2, 5} (Largest number is at index 0)
 * 
 * Pass 2 (i = 1):
 * - i=1, j=2: arr[1](2) < arr[2](5)? YES!
 *   Action: Swap 2 and 5 -> {9, 5, 2}
 * >> Result after Pass 2: {9, 5, 2} (Second largest is at index 1)
 * 
 * Final Output: 9, 5, 2
 */
public class DescendingSortArrayWithoutUsingArraySort {

    public static void main(String[] args) {

        // 1. Initialize an integer array with unsorted values
        int[] arr = {5, 2, 9, 1, 5, 6};

        // 2. Outer loop 'i' picks a spot in the array to fill (from index 0 to end)
        for (int i = 0; i < arr.length; i++) {

            // 3. Inner loop 'j' searches through all elements to the right of 'i'
            for (int j = i + 1; j < arr.length; j++) {

                // 4. If current element at 'i' is SMALLER than the element at 'j'
                if (arr[i] < arr[j]) {

                    // 5. Store the smaller value (arr[i]) in a temporary box
                    int temp = arr[i];

                    // 6. Move the larger value (arr[j]) to the current position (arr[i])
                    arr[i] = arr[j];

                    // 7. Put the smaller value from the box back into position 'j'
                    arr[j] = temp;

                } // 8. End of 'if' check (we swapped if we found a larger number)
            } // 9. End of inner 'j' loop
        } // 10. End of outer 'i' loop (The array is now sorted Largest to Smallest)

        // 11. Start a 'for-each' loop to print the now-sorted array
        for (int num : arr) {

            // 12. Print each number to the console one by one
            System.out.println(num);

        } // 13. End of printing loop

    } // 14. Closing brace for main method
} // 15. Closing brace for class
