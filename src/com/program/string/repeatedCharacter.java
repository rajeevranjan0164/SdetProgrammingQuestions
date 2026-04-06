package com.program.string;

import java.util.HashMap;
import java.util.Map;

/**
 * This program identifies characters that repeat in a string.
 * It uses a HashMap to count the occurrences of each character.
 * 
 * --- DRY RUN (Input: "java") ---
 * Step 1: Count Characters using Map
 *    'j' -> count 1
 *    'a' -> count 1
 *    'v' -> count 1
 *    'a' -> exists! count becomes 2
 * 
 * Step 2: Iterate through Map and find counts > 1
 *    - Check 'j': count is 1 (skip)
 *    - Check 'a': count is 2 (PRINT 'a')
 *    - Check 'v': count is 1 (skip)
 */
public class RepeatedCharacter {

    public static void main(String[] args) {
        // 1. Define the input string
        String str = "programming";

        // 2. Use a HashMap to store each character as a 'Key' and its count as a 'Value'
        Map<Character, Integer> charCount = new HashMap<>();

        // 3. Loop through each character in the string
        for (char ch : str.toCharArray()) {
            
            // 4. Update the count for the current character in the map
            // getOrDefault(ch, 0) starts at 0 if the character is new
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // 5. Iterate through the Map entries to find repeated characters
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            
            // 6. If the count (Value) is greater than 1, it means the character repeats
            if (entry.getValue() > 1) {
                // 7. Print the repeated character
                System.out.println("Repeated character: " + entry.getKey());
            }
        }
    }
}
