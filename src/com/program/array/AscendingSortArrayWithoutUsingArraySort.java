package com.program.array;

/**
 * PROGRAM: SORT ARRAY WITHOUT USING Arrays.sort()
 * (Uses a nested loop to sort elements in ascending order)
 * 
 * --- DRY RUN (Example: {5, 2, 9}) ---
 * Input Array: {5, 2, 9}
 * 
 * Pass 1 (i = 0):
 * - i=0, j=1: arr[0](5) > arr[1](2)? YES!
 *   Action: Swap 5 and 2 -> {2, 5, 9}
 * - i=0, j=2: arr[0](2) > arr[2](9)? NO.
 * >> Result after Pass 1: {2, 5, 9} (The smallest number is at index 0)
 * 
 * Pass 2 (i = 1):
 * - i=1, j=2: arr[1](5) > arr[2](9)? NO.
 * >> Result after Pass 2: {2, 5, 9} (The second smallest is at index 1)
 * 
 * Final Output: 2, 5, 9
 */
public class AscendingSortArrayWithoutUsingArraySort {

    public static void main(String[] args) {

        // 1. Initialize an integer array with unsorted values
        int[] arr = {5, 2, 9, 1, 5, 6};

        // 2. Outer loop 'i' starts from index 0 and goes to the end of the array
        for (int i = 0; i < arr.length; i++) {
            
            // 3. Inner loop 'j' starts from the next element (i + 1)
            for (int j = i + 1; j < arr.length; j++) {
                
                // 4. If the element at index 'i' is larger than the element at index 'j'
                if (arr[i] > arr[j]) {
                    
                    // 5. Use a 'temp' variable to temporarily store the value at arr[i]
                    int temp = arr[i];
                    
                    // 6. Move the smaller value (arr[j]) to the current position (arr[i])
                    arr[i] = arr[j];
                    
                    // 7. Move the stored larger value (temp) to the position arr[j]
                    arr[j] = temp;
                    
                } // 8. End of 'if' check
            } // 9. End of inner 'j' loop
        } // 10. End of outer 'i' loop (The array is now sorted)

        // 11. Loop through the now-sorted array using a 'for-each' loop
        for (int num : arr) {
            
            // 12. Print each number to the console one by one
            System.out.println(num);
            
        } // 13. End of printing loop
        
    } // 14. Closing brace for the main method
} // 15. Closing brace for the class
