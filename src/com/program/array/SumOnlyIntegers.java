package com.program.array;

public class SumOnlyIntegers {

    public static void main(String[] args) {
            String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};

            int sum = 0;
            for (String str : array) {
                try {
                    sum += Integer.parseInt(str); // Convert to integer & add
                } catch (NumberFormatException e) {
                    // Ignore non-integer values
                }
            }

            System.out.println("Sum of integers: " + sum);
        }
}
