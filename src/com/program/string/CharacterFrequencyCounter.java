package com.program.string;

import java.util.HashMap;
import java.util.Map;

/**
 * This program counts the frequency of each character in a string using a HashMap.
 * 
 * --- DRY RUN (Example: "aba") ---
 * String input = "aba"
 * 
 * 1. mapChar = {} (Empty HashMap)
 * 2. Loop 1 (ch = 'a'): mapChar.put('a', 0 + 1) -> {a: 1}
 * 3. Loop 2 (ch = 'b'): mapChar.put('b', 0 + 1) -> {a: 1, b: 1}
 * 4. Loop 3 (ch = 'a'): mapChar.put('a', 1 + 1) -> {a: 2, b: 1}
 * 
 * Final Output (Iteration over Map): "a2b1" (Order may vary in HashMap)
 */
public class CharacterFrequencyCounter {

    public static void main(String[] args) {
        
        // 1. Declare the input string to be counted
        String input = "aabbccddeea";

        // 2. Initialize a HashMap to store characters as 'Keys' and their counts as 'Values'
        Map<Character, Integer> mapChar = new HashMap<>();

        // 3. Convert the string to a character array and iterate through each character
        for (char ch : input.toCharArray()) {

            // 4. Update the character's count in the map
            // getOrDefault(ch, 0) returns the current count, or 0 if it's the first time seeing 'ch'
            mapChar.put(ch, mapChar.getOrDefault(ch, 0) + 1);
        }

        // 5. Iterate through the entries (key-value pairs) in the Map
        for (Map.Entry<Character, Integer> mapEnt : mapChar.entrySet()) {
            
            // 6. Print the character (Key) followed by its frequency (Value) on the same line
            System.out.print(mapEnt.getKey().toString() + mapEnt.getValue().toString());
        }
    }
}
