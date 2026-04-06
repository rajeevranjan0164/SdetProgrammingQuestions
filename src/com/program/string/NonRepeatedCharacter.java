package com.program.string;

import java.util.HashMap;
import java.util.Map;

/**
 * --- DRY RUN (Example: "java") ---
 * Step 1: Count Frequencies using HashMap
 *    'j' -> 1
 *    'a' -> 2
 *    'v' -> 1
 * 
 * Step 2: Iterate through Map and find counts == 1
 *    - 'j' has count 1: Print 'j'
 *    - 'a' has count 2: Skip
 *    - 'v' has count 1: Print 'v'
 * Final Output: j, v
 */
public class NonRepeatedCharacter {

    public static void main(String[] args) {

        // 1. Declare the input string
        String str = "programming";

        // 2. Normalize the string to lowercase for uniform comparison
        str = str.toLowerCase();

        // 3. Create a HashMap to store the count of each character
        Map<Character, Integer> charCount = new HashMap<>();

        // 4. Loop through the string to populate the HashMap with frequencies
        for (char c : str.toCharArray()) {
            // 5. Update the count: if character exists, add 1; else start at 0 and add 1
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // 6. Iterate through the HashMap entries to find characters with a count of 1
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            
            // 7. If the value (count) is exactly 1, the character is non-repeated
            if (entry.getValue() == 1) {
                // 8. Print the non-repeated character and its count
                System.out.println("Non-repeated Character: " + entry.getKey() + ", Count: " + entry.getValue());
            }
        }
    }
}
