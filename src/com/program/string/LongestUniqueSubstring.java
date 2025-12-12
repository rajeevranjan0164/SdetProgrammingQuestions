package com.program.string;

import java.util.HashSet;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String input = "abcabcbb";
        String longestSubstring = findLongestUniqueSubstring(input);
        System.out.println("Longest Substring Without Repeating Characters: " + longestSubstring);
    }

    public static String findLongestUniqueSubstring(String str) {
        int left = 0, right = 0;
        int maxLength = 0, startIndex = 0;
        HashSet<Character> uniqueChars = new HashSet<>();

        while (right < str.length()) {
            char currentChar = str.charAt(right);

            // If character is already in the set, remove leftmost character until it's unique
            while (uniqueChars.contains(currentChar)) {
                uniqueChars.remove(str.charAt(left));
                left++;
            }

            // Add current character to the set and update the longest substring if needed
            uniqueChars.add(currentChar);
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startIndex = left;
            }

            right++;
        }

        // Extract the longest unique substring
        return str.substring(startIndex, startIndex + maxLength);
    }
}
