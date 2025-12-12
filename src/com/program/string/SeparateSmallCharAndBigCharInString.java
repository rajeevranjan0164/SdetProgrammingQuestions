package com.program.string;

import java.util.Arrays;

public class SeparateSmallCharAndBigCharInString {

    public static void main(String[] args) {

        String str = "aBACbcEDed";

        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();

        for (char chr : str.toCharArray()) {
            if (Character.isLowerCase(chr)) {
                lower.append(chr);
            } else {
                upper.append(chr);
            }
        }
        System.out.println(lower);
        System.out.println(upper);

        // Convert to char arrays for sorting
        char[] lowerArr = lower.toString().toCharArray();
        char[] upperArr = upper.toString().toCharArray();

        // Sort both arrays
        Arrays.sort(lowerArr);
        Arrays.sort(upperArr);

        // Print results
        System.out.println("Lowercase sorted: " + new String(lowerArr));
        System.out.println("Uppercase sorted: " + new String(upperArr));
    }
}
