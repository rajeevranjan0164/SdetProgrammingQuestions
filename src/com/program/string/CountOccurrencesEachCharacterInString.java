package com.program.string;

import java.util.HashMap;
import java.util.Map;

/**
 * This program counts the occurrences of each character in a string using a HashMap.
 * 
 * --- DRY RUN (Example: "A a") ---
 * String str = "A a"
 * 1. Step 1 (Cleanup): str = "A a".replaceAll("\\s+", "").toLowerCase() -> "aa"
 * 
 * 2. Loop 1 (ch = 'a'): map.getOrDefault('a', 0) + 1 -> 0 + 1. Map: {a=1}
 * 3. Loop 2 (ch = 'a'): map.getOrDefault('a', 0) + 1 -> 1 + 1. Map: {a=2}
 * 
 * Final Output: {a=2}
 */
public class CountOccurrencesEachCharacterInString {

    public static void main(String[] args) {

        // 1. Declare the original input string to be processed
        String str = "Test Automation Java Automation";

        // 2. Normalize and clean the string:
        //    - replaceAll("\\s+", "") removes all spaces
        //    - toLowerCase() handles case-insensitivity
        str = str.replaceAll("\\s+", "").toLowerCase();

        // 3. Initialize a HashMap to store characters as 'Keys' and their total counts as 'Values'
        Map<Character, Integer> map = new HashMap<>();

        // 4. Iterate over each character in the normalized string
        for (char ch : str.toCharArray()) {
            
            // 5. Update the count for the current character in the map
            // getOrDefault(ch, 0) starts at 0 if the character is new, then we add 1
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        // 6. Print the entire map containing character counts
        System.out.println("Full Count Map: " + map);

        // 7. Iterate through the map entries and print each character and its total count
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(" " + entry.getKey() + " :: " + entry.getValue());
        }
    }
}
