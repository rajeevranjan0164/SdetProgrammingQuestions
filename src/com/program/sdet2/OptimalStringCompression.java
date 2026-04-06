package com.program.sdet2;

/**
 * --- SDET 2 QUESTION: Optimal String Compression ---
 * 
 * The Goal: Perform basic run-length encoding. 
 * Input: "aabcccccaaa" -> Output: "a2b1c5a3"
 * 
 * --- SENIOR CONSIDERATIONS ---
 * 1. Efficient Building: Use StringBuilder instead of String concatenation.
 * 2. Return Shortest: If compressed string is not shorter than original, return original.
 * 3. Space Complexity: O(n) Time, O(n) Space.
 */
public class OptimalStringCompression {

    public static void main(String[] args) {
        String input = "aabcccccaaa";
        String result = compress(input);
        System.out.println("Original: " + input);
        System.out.println("Result: " + result);
    }

    public static String compress(String str) {
        // 1. Check for null and short strings (minimum length to compress is 3)
        if (str == null || str.length() <= 2) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;

        // 2. Loop through the string and count consecutive characters
        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            // 3. If the next character is different, or we've reached the end, 
            // append the current character and its count to the result.
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                
                // 4. Reset the count for the next character
                countConsecutive = 0;
            }
        }

        // 5. Senior Rule: Return the compressed string ONLY if it's actually shorter.
        // For example, "abc" compressed is "a1b1c1", which is longer (6 vs 3).
        return compressed.length() < str.length() ? compressed.toString() : str;
    }
}
