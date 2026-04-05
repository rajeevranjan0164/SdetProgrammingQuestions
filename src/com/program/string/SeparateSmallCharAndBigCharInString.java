package com.program.string;

import java.util.Arrays;

/**
 * This program separates lowercase and uppercase characters from a string,
 * sorts them independently, and displays the results.
 */
public class SeparateSmallCharAndBigCharInString {

    public static void main(String[] args) {
        String str = "aBACbcEDed";

        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();

        // 1. Separate based on case
        for (char chr : str.toCharArray()) {
            if (Character.isLowerCase(chr)) {
                lower.append(chr);
            } else if (Character.isUpperCase(chr)) {
                upper.append(chr);
            }
        }

        // 2. Convert to char arrays for sorting
        char[] lowerArr = lower.toString().toCharArray();
        char[] upperArr = upper.toString().toCharArray();

        // 3. Sort both arrays alphabetically
        Arrays.sort(lowerArr);
        Arrays.sort(upperArr);

        // 4. Output the results
        System.out.println("Original String: " + str);
        System.out.println("Sorted Lowercase: " + new String(lowerArr));
        System.out.println("Sorted Uppercase: " + new String(upperArr));
        System.out.println("Combined Result: " + new String(lowerArr) + new String(upperArr));
    }
}
