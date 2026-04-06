package com.program.string;

import java.util.HashMap;
import java.util.Map;

/**
 * This program identifies and prints all characters that repeat in a string, 
 * along with their total counts.
 * 
 * --- DRY RUN (Example: "java") ---
 * Step 1: Count Character Frequencies using HashMap
 *    'j' -> count 1
 *    'a' -> count 1
 *    'v' -> count 1
 *    'a' -> exists! count becomes 2
 * 
 * Step 2: Iterate through the Map to find frequencies > 1
 *    - 'j': count is 1 (Skip)
 *    - 'a': count is 2 (PRINT 'a': 2)
 *    - 'v': count is 1 (Skip)
 * Final Output: a: 2
 */
public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        
        // 1. Define the input string
        String str = "programming";
        
        // 2. Call the static method to process the string
        printRepeatedCharacters(str);
    }

    public static void printRepeatedCharacters(String str) {
        
        // 3. Normalize the string to lowercase for case-insensitivity
        str = str.toLowerCase();

        // 4. Create a HashMap to store the frequency of each character
        Map<Character, Integer> charCount = new HashMap<>();

        // 5. Convert the string to a character array
        char[] chArray = str.toCharArray();
        
        // 6. Loop through the array to populate the frequency Map
        for (char ch : chArray) {
            // 7. Increment count: get current count (default 0) and add 1
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // 8. Print a descriptive label for the repeated characters
        System.out.println("Repeated characters and their counts:");

        // 9. Iterate through the Map entries
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            
            // 10. Check if the value (count) is greater than 1
            if (entry.getValue() > 1) {
                // 11. Print the character and how many times it repeated
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
