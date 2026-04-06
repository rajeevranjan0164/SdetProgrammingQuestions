package com.program.sdet2;

import java.util.HashSet;
import java.util.Set;

/**
 * --- SDET 2 QUESTION: Longest Substring Without Repeating Characters ---
 * 
 * The Goal: Find the length of the longest unique substring.
 * Input: "abcabcbb" -> Output: 3 ("abc")
 * 
 * --- SENIOR CONSIDERATIONS ---
 * 1. Complexity: O(n) Time using the SLIDING WINDOW pattern.
 * 2. Two Pointers: 'left' and 'right' pointers define the window.
 * 3. Space Complexity: O(k) Space where k is the size of the alphabet.
 */
public class SlidingWindowLongestSubstring {

    public static void main(String[] args) {
        String input = "abcabcbb";
        int length = findLongestUniqueLength(input);
        System.out.println("Input: " + input);
        System.out.println("Longest Unique Length: " + length);
    }

    public static int findLongestUniqueLength(String s) {
        if (s == null || s.length() == 0) return 0;

        int left = 0, right = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();

        // 1. Expand the window by moving the right pointer
        while (right < s.length()) {
            char ch = s.charAt(right);

            // 2. If the character is already in the window, shrink from the left
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            // 3. Add the unique character and update the maximum length
            set.add(ch);
            maxLength = Math.max(maxLength, right - left + 1);
            
            // 4. Move to the next character
            right++;
        }

        return maxLength;
    }
}
