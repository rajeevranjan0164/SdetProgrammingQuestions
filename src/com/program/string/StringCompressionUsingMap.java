package com.program.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This program demonstrates how to compress a string using a LinkedHashMap.
 * Using LinkedHashMap ensures that the character counts appear in the order
 * they first appeared in the original string.
 *
 * Example: "aabbcc" -> "a2b2c2"
 */
public class StringCompressionUsingMap {

    public static void main(String[] args) {
        String str = "aabbcccddd";

        // We use LinkedHashMap to preserve the order characters appear in the string.
        Map<Character, Integer> charCount = new HashMap<>();

        // 1. Populate the Map with total character counts
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        StringBuilder compressed = new StringBuilder();

        // 2. Build the output string by appending character + frequency
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            compressed.append(entry.getKey()).append(entry.getValue());
        }

        // 3. Final Output
        System.out.println("Original String: " + str);
        System.out.println("Compressed Output: " + compressed.toString());
    }
}
