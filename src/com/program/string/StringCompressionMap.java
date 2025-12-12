package com.program.string;

import java.util.HashMap;
import java.util.Map;

public class StringCompressionMap {

    /**
     * Compresses a given string by counting consecutive occurrences of characters.
     * For example, "aabbcccdd" becomes "a2b2c3d2".
     * This method uses a HashMap to store character counts, which means the order
     * of characters in the compressed string might not be the same as in the original
     * if there are non-consecutive identical characters (e.g., "ababa" might become "a3b2"
     * or "b2a3" depending on HashMap iteration order, not "a1b1a1b1a1").
     *
     * For true "run-length encoding" where order is preserved and only *consecutive*
     * characters are counted, a different approach without a HashMap is needed.
     * This implementation effectively counts the total occurrences of each character
     * and then appends them in the order they appear in the HashMap's entry set.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {

        String str = "aabbcccdd";

        Map<Character, Integer> charCount = new HashMap<>();

        // Populate the HashMap with character counts
        for (char chr : str.toCharArray()) {
            charCount.put(chr, charCount.getOrDefault(chr,0)+1);
        }

        StringBuilder stringBuilder = new StringBuilder();

        // Iterate through the map entries and append character and its count to the StringBuilder
        for (Map.Entry<Character, Integer> mapEntry : charCount.entrySet()) {
            stringBuilder.append(mapEntry.getKey()).append(mapEntry.getValue());
        }
        System.out.println(stringBuilder);

    }
}
