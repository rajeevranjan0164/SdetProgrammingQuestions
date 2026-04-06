package com.program.string;

import java.util.Arrays;

/**
 * This program determines if two strings are anagrams.
 * An anagram is a word or phrase formed by rearranging the letters of another word or phrase.
 * 
 * --- DRY RUN (Example: "Race" and "Care") ---
 * 1. Normalize: "race" and "care"
 * 2. To Char Array: ['r', 'a', 'c', 'e'] and ['c', 'a', 'r', 'e']
 * 3. Sort Array 1: ['a', 'c', 'e', 'r']
 * 4. Sort Array 2: ['a', 'c', 'e', 'r']
 * 5. Compare: Arrays.equals() -> TRUE
 * Final Result: "Given strings are Anagrams"
 */
public class Anagram {

    public static void main(String[] args) {
        
        // 1. Declare the two strings to compare
        String str1 = "listen";
        String str2 = "silent";

        // 2. Remove all spaces and convert to lowercase for uniform comparison
        String cleanStr1 = str1.replaceAll("\\s+", "").toLowerCase();
        String cleanStr2 = str2.replaceAll("\\s+", "").toLowerCase();

        // 3. Convert both cleaned strings to character arrays
        char[] charArray1 = cleanStr1.toCharArray();
        char[] charArray2 = cleanStr2.toCharArray();

        // 4. Sort both character arrays alphabetically
        // This is the key trick: if they have the same letters, they will sort the same way.
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // 5. Check if the sorted character arrays are identical
        if (Arrays.equals(charArray1, charArray2)) {
            // 6. If they match, they contain the exact same letters in different orders
            System.out.println("Given strings are Anagrams");
        } else {
            // 7. If they don't match, they have different letters
            System.out.println("Given strings are NOT Anagrams");
        }
    }
}
