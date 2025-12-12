package com.program.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class UniqueCharactersTwo {

    /**
     * This program finds and prints unique characters from a given string.
     * A character is considered unique if it appears only once in the string.
     */

    public static void main(String[] args) {
        String str = "Java Automation";

        Map<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Iterate through the map to find characters with a count of 1 (unique characters)
        System.out.print("Unique characters: ");

        for (Map.Entry<Character,Integer> map : charCount.entrySet()) {
            /**
             * This loop iterates through each entry in the charCount map.
             * Each entry represents a character and its corresponding count in the string.
             */

            /**
             * If the character count is 1, it means the character is unique.
             * Print the unique character.
             */
            if (map.getValue()==1) {
                System.out.print(map.getKey());
            }
        }
    }
}
