package com.program.array;

public class SecoundLargestElementInArray {

    public static void main(String[] args) {

        int[] numbers = {12, 45, 67, 45, 89, 89, 23};

        int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible integer value
        int Seclargest = Integer.MIN_VALUE; // Initialize Seclargest to the smallest possible integer value

        for (int i = 0; i < numbers.length; i++) { // Iterate through each element in the array

            if (numbers[i] > largest) {
                Seclargest = largest; // The previous largest becomes the second largest

                largest = numbers[i];
            }
        }

        System.out.println("Second Largest: " + Seclargest);


    }
}
