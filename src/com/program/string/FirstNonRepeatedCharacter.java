package com.program.string;

import java.util.HashMap;
import java.util.Map;

/**
 * This program identifies and prints the VERY FIRST character in a string
 * that does not repeat anywhere else.
 * 
 * --- DRY RUN (Example: "programming") ---
 * Step 1: Count Character Frequencies using HashMap
 *    'p' -> 1, 'r' -> 2, 'o' -> 1, 'g' -> 2, 'a' -> 1, 'm' -> 2, 'i' -> 1, 'n' -> 1
 * 
 * Step 2: Iterate through the ORIGINAL STRING (to maintain order)
 *    - Check 'p': Is count in Map == 1? 
 *    - YES! Print 'p' and stop the loop immediately.
 * Final Result: p
 */
public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        
        // 1. Define the input string
        String str = "programming";
        
        // 2. Call the static method to find the first non-repeated character
        findFirstNonRepeatedCharacter(str);
    }

    public static void findFirstNonRepeatedCharacter(String str) {
        
        // 3. Normalize the string to lowercase for case-insensitivity
        str = str.toLowerCase();

        // 4. Create a HashMap to store character frequencies
        Map<Character, Integer> charCount = new HashMap<>();

        // 5. Populate the HashMap with counts of each character
        for (char ch : str.toCharArray()) {
            // 6. If character exists, increment count; else start at 1
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // 7. Iterate through the string AGAIN to find the FIRST non-repeated char
        // We loop through the string (not the Map) to maintain the original order.
        for (char ch : str.toCharArray()) {
            
            // 8. If the character's frequency in our Map is exactly 1
            if (charCount.get(ch) == 1) {
                
                // 9. This must be the first character that doesn't repeat!
                System.out.println("First non-repeated character: " + ch);
                
                // 10. Exit the loop and method immediately
                return;
            }
        }
        
        // 11. If we finish the loop and never returned, no non-repeated character exists
        System.out.println("No non-repeated character found.");
    }
}
