package com.program.array;

/**
 * This class demonstrates how to sum only the integer values from a String array,
 * ignoring any non-integer elements.
 */
public class SumOnlyIntegers {

    /**
     * Main method to demonstrate summing only integer values from a String array.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {

        // Define a String array containing a mix of integer strings and non-integer strings.
        // We want to sum only the valid integer values.

        String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};

        int sum = 0;
        // Iterate through each element in the array.
        for (String str : array) {
                try {

                    sum += Integer.parseInt(str); // Convert to integer & add
                } catch (NumberFormatException e) {
                    // If a NumberFormatException occurs, it means the string is not a valid integer.
                    // In this case, we simply ignore the element and continue to the next one.
                    // No action is needed here as per the requirement to sum *only* integers.
                }
            }

            System.out.println("Sum of integers: " + sum);
        }
}
