package com.program.string;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCounter {

    public static void main(String[] args) {
        /**
         * This program counts the frequency of each character in a given string.
         * For example, if the input is "aabbccddeea", the output will be a5b2c2d2e2.
         */
        String input = "aabbccddeea";

        // Create a HashMap to store character frequencies.
        // The key will be the character and the value will be its count.
        Map<Character,Integer> mapChar = new HashMap<>();

        // Iterate over each character in the input string.

        for (char ch : input.toCharArray()) {

            // If the character is already in the map, increment its count.
            // Otherwise, add the character to the map with a count of 1.
            mapChar.put(ch, mapChar.getOrDefault(ch, 0) + 1);
        }


        // Iterate over the entries in the HashMap to print the character frequencies.
        for (Map.Entry<Character,Integer> mapEnt : mapChar.entrySet()) {
            /**
             * Print the character and its frequency.
             * The output format is character followed by its count (e.g., a5).
             */
            System.out.print(mapEnt.getKey().toString() + mapEnt.getValue().toString());
        }
    }
}
