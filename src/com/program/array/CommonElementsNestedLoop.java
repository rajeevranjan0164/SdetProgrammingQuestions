package com.program.array;

/**
 * This program identifies common elements between two arrays using nested loops.
 * 
 * --- DRY RUN (Example: arr1={1,2}, arr2={2,3}) ---
 * 1. Outer Loop i = 0 (val=1):
 *    - Inner j=0 (val=2): 1 == 2 is FALSE.
 *    - Inner j=1 (val=3): 1 == 3 is FALSE.
 * 
 * 2. Outer Loop i = 1 (val=2):
 *    - Inner j=0 (val=2): 2 == 2 is TRUE.
 *    - PRINT 2 and BREAK inner loop.
 * 
 * Final Output: 2
 */
public class CommonElementsNestedLoop {

    public static void main(String[] args) {

        // 1. Declare two sample integer arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        System.out.println("Common elements found:");

        // 2. Outer loop: Iterate through each element of the first array
        for (int i = 0; i < array1.length; i++) {
            
            // 3. Inner loop: For each element in array1, compare it with every element in array2
            for (int j = 0; j < array2.length; j++) {
                
                // 4. Check if the element from array1 matches the current element from array2
                if (array1[i] == array2[j]) {
                    
                    // 5. If a match is found, print the common element
                    System.out.println(array1[i]);
                    
                    // 6. Break the inner loop to move to the next element in array1
                    // This avoids printing the same common element twice if array2 had duplicates.
                    break;
                }
            }
        }
    }
}
