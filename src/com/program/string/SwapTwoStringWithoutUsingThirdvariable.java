package com.program.string;

public class SwapTwoStringWithoutUsingThirdvariable {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swapping: str1 = " + str1 + ", str2 = " + str2);

        // Swap without third variable
        str1 = str1 + str2;  // Concatenate both strings
        System.out.println(str1);
        // The length of the original str1 is 5.
        str2 = str1.substring(str1.length() - str2.length()); // Extract original str1
        System.out.println(str2);
        str1 = str1.substring(0, 5); // Extract original str2
        System.out.println(str1);
        System.out.println("After swapping: str1 = " + str1 + ", str2 = " + str2);
    }
}
