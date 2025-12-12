package com.program.array;

public class SecoundLargestElementInArray {

    public static void main(String[] args) {

        int[] numbers = {12, 45, 67, 45, 89, 89, 23};

        int largest = Integer.MIN_VALUE;
        int Seclargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                Seclargest = largest;
                largest = numbers[i];
            } /*else if (numbers[i] > Seclargest && numbers[i] != largest) {
                Seclargest = numbers[i];
            }*/
        }

        System.out.println("Second Largest: " + Seclargest);


    }
}
