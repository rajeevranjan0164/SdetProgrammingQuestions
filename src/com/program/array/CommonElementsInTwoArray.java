package com.program.array;

import java.util.HashSet;
import java.util.Set;

/**
 * This program identifies the common elements between two integer arrays using HashSets.
 * 
 * --- DRY RUN (Example: arr1={1,2}, arr2={2,3}) ---
 * 1. Step 1 (Populate set): 
 *    - Process 1: set = {1}
 *    - Process 2: set = {1, 2}
 * 
 * 2. Step 2 (Check arr2 against set):
 *    - Check 2: set.contains(2) is TRUE. commonSet = {2}
 *    - Check 3: set.contains(3) is FALSE. 
 * 
 * Final Output: [2]
 */
public class CommonElementsInTwoArray {

    public static void main(String[] args) {

        // 1. Declare two sample integer arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        // 2. Create a HashSet to store all unique elements from the first array
        // HashSet provides O(1) average time complexity for lookups (contains)
        Set<Integer> set = new HashSet<>(); 
        
        // 3. Create a HashSet to store the common elements found between both arrays
        Set<Integer> commonSet = new HashSet<>(); 

        // 4. Loop through the first array and add every number to our lookup set
        for (int num : array1) {
            set.add(num);
        }

        // 5. Iterate through the second array
        for (int num2 : array2) {
            
            // 6. Check if the current number from array2 exists in the lookup set (array1 elements)
            if (set.contains(num2)) {
                
                // 7. If it exists in both, add it to the final collection of common elements
                commonSet.add(num2);
            }
        }
        
        // 8. Print the final set of common elements
        System.out.println("Common elements: " + commonSet);
    }
}
