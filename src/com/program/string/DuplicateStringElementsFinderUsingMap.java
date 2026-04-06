package com.program.string;

import java.util.HashMap;
import java.util.Map;

/**
 * This program identifies duplicate characters in a string by using a HashMap 
 * to store each character as a key and its total frequency as the value.
 * 
 * --- DRY RUN (Example: "hello") ---
 * String word = "hello"
 * 
 * 1. Step 1: Build Frequency Map:
 *    - 'h' -> count 1
 *    - 'e' -> count 1
 *    - 'l' -> count 1
 *    - 'l' -> count 2 (Duplicate found!)
 *    - 'o' -> count 1
 *    Final Map: {h:1, e:1, l:2, o:1}
 * 
 * 2. Step 2: Iterate through Map to find entries with counts > 1:
 *    - 'h': 1 (Skip)
 *    - 'e': 1 (Skip)
 *    - 'l': 2 (Value > 1, Print 'l: 2')
 *    - 'o': 1 (Skip)
 * 
 * Output: " l: 2"
 */
public class DuplicateStringElementsFinderUsingMap {

    public static void main(String[] args) {
        
        // 1. Declare the input word to check for duplicates
        String word = "hello";

        // 2. Initialize a HashMap to store each character as a 'Key' and its total count as a 'Value'
        Map<Character, Integer> map = new HashMap<>();

        // 3. Convert the word to a character array and iterate through it
        for (char chh : word.toCharArray()) {
            
            // 4. Update the character's count in the map
            // getOrDefault(chh, 0) returns the current count (defaulting to 0 if new)
            // Then we add 1 and store it back into the map
            map.put(chh, map.getOrDefault(chh, 0) + 1);
        }

        // 5. Use an entry set to iterate through the character-count pairs in the map
        for (Map.Entry<Character, Integer> mapEntry : map.entrySet()) {
            
            // 6. Check if the value (total count) of the current character is greater than 1
            if (mapEntry.getValue() > 1) {
                
                // 7. If count is > 1, print the duplicate character and its total count
                System.out.println(" " + mapEntry.getKey() + ": " + mapEntry.getValue());
            }
        }
    }
}
