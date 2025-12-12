package com.program.string;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesEachCharterInString {

    public static void main(String[] args) {

        String str = "Test Automation Java Automation"; // Original string


        // Remove all whitespace characters and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        // System.out.println(str); // This line was commented out

        /**
         * A Map to store character occurrences.
         * The key is the character and the value is its count.
         */
        Map<Character, Integer> map = new HashMap<>();

        /**
         * Iterate over each character in the string and count its occurrences.
         */

        /**
         * For each character, increment its count in the map. If the character is not already in the map, add it with a count of 1.
         */
        for (char ch : str.toCharArray()) {
            // Check if the character is already in the map
            // If it is, increment its count
            // If not, add it to the map with a count of 1


            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        System.out.println(map);

        // Iterate through the map and print each character and its count
        for (Map.Entry<Character, Integer> integerEntry : map.entrySet()) {
            System.out.println(" " +integerEntry.getKey() + ":: "+integerEntry.getValue());
        }
    }
}
