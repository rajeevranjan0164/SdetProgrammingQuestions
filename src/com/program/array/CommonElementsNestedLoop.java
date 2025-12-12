package com.program.array;

/**
 * This class demonstrates how to find common elements between two arrays
 * using nested loops.
 */
public class CommonElementsNestedLoop {


    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        // Iterate through each element of the first array
        for (int i=0;i<array1.length;i++) {
            // For each element in array1, iterate through each element of the second array
            for (int j=0; j<array2.length;j++) {
                // If a common element is found, print it and break the inner loop
                if (array1[i]== array2[j]) {
                    System.out.println(array1[i]);
                    break;
                }
            }
        }
    }
}
