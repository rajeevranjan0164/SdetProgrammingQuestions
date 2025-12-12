package com.program.string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateString {

    public static void main(String[] args) {
        String word = "hello";

        Set<Character> uniqueChar = new HashSet<>();

        /*
         * Convert the string to a character array and iterate through it.
         * - HashSet does not allow duplicate values.
         * - If the character is not already in the HashSet, add it and print it.
         */
        for (char ch : word.toCharArray()) {
            if (uniqueChar.add(ch)) // Adds the character only if it's not already present
            System.out.print(ch);
        }
    }
}
