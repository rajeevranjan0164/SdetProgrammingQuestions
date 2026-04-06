package com.program.sdet2;

import java.util.*;

/**
 * --- SDET 2 QUESTION: First Unique Character (Single Pass) ---
 * 
 * The Goal: Find the first non-repeating character in a string.
 * Input: "loveleetcode" -> Output: 'v'
 * 
 * --- SENIOR CONSIDERATIONS ---
 * 1. Single Pass: Use a LinkedHashMap to preserve the insertion order.
 * 2. Frequency Array: For ASCII strings, an array (int[256]) is more efficient.
 * 3. Handling Streams: This approach can be used for real-time data streams.
 */
public class FirstUniqueCharacterStream {

    public static void main(String[] args) {
        String input = "loveleetcode";
        char result = firstUniqueChar(input);
        System.out.println("Input: " + input);
        System.out.println("First Unique Character: " + result);
    }

    /**
     * Finds the first unique character using a LinkedHashMap to preserve order.
     */
    public static char firstUniqueChar(String s) {
        // 1. LinkedHashMap maintains the order in which characters first appear
        Map<Character, Integer> counts = new LinkedHashMap<>();

        // 2. Count the occurrences of each character
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        // 3. The first character in the Map with a count of 1 is our answer
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // 4. Return a placeholder if no unique character is found
        return '\0';
    }
}
