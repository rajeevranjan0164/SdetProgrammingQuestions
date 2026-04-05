package com.program.string;

public class SwapTwoStringsWithoutUsingThirdVariable {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("--------------------");

        // Step 1: Concatenate both strings and assign the result to str1
        // Example: "Hello" + "World" = "HelloWorld"
        str1 = str1 + str2;

        // Step 2: Extract the original str1 and assign it to str2
        // We do this by taking a substring from the beginning (index 0) 
        // up to the total length MINUS the length of the original str2.
        // This gives us the length of the original str1.
        // Example: "HelloWorld".substring(0, 10 - 5) -> "HelloWorld".substring(0, 5) -> "Hello"
        str2 = str1.substring(0, str1.length() - str2.length());

        // Step 3: Extract the original str2 and assign it to str1
        // Since str2 now holds the original str1 (e.g., "Hello", length 5), 
        // we just need to take everything in the combined string AFTER that length.
        // Example: "HelloWorld".substring(5) -> "World"
        str1 = str1.substring(str2.length());

        System.out.println("After swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
