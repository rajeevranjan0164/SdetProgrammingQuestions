package com.program.array;

public class ArrayRotation {

    /*
    * We create a temporary array temp to store the first rotateBy elements of the original array.
    We copy the first rotateBy elements of the original array to the temporary array.
    We then shift the remaining elements of the original array to the left by rotateBy positions.
    Finally, we copy the elements from the temporary array back to the end of the original array to complete the rotation.*/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotateBy = 2;

        System.out.println("Original array:");
        printArray(arr);

        rotateLeft(arr, rotateBy);

        System.out.println("\nArray after left rotation by " + rotateBy + " positions:");
        printArray(arr);
    }

    public static void rotateLeft(int[] arr, int rotateBy) {
        int n = arr.length;
        int[] temp = new int[rotateBy];

        // Copy the first rotateBy elements to a temporary array
        for (int i = 0; i < rotateBy; i++) {
            temp[i] = arr[i];
        }

        // Shift remaining elements to the left
        for (int i = rotateBy; i < n; i++) {
            arr[i - rotateBy] = arr[i];
        }

        // Copy elements from the temporary array to the end of the original array
        for (int i = 0; i < rotateBy; i++) {
            arr[n - rotateBy + i] = temp[i];
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

