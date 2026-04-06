package com.program.string;

import java.util.HashMap;
import java.util.Map;

/**
 * This program counts the occurrences of each word in a given string using a HashMap.
 * 
 * --- DRY RUN (Example: "Java is Java") ---
 * 1. str = "Java is Java"
 * 2. strArray = ["Java", "is", "Java"]
 * 
 * 3. Loop 1 ("Java"): map.getOrDefault("Java", 0) + 1 -> 0 + 1. Map: {Java=1}
 * 4. Loop 2 ("is"): map.getOrDefault("is", 0) + 1 -> 0 + 1. Map: {Java=1, is=1}
 * 5. Loop 3 ("Java"): map.getOrDefault("Java", 0) + 1 -> 1 + 1. Map: {Java=2, is=1}
 * 
 * Final Output: {Java=2, is=1}
 */
public class CountOccurrencesEachWordInString {

    public static void main(String[] args) {

        // 1. Declare the input string to be processed
        String str = "Test Automation Java Automation";

        // 2. Split the sentence into an array of words based on spaces
        String[] strArray = str.split(" ");

        // 3. Initialize a HashMap to store words as 'Keys' and their counts as 'Values'
        Map<String, Integer> map = new HashMap<>();

        // 4. Iterate through each word in the array
        for (String word : strArray) {
            
            // 5. Update the count for the current word in the map
            // getOrDefault(word, 0) starts at 0 if the word is new, then we add 1
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // 6. Print the entire map containing word counts
        System.out.println("Count of Words in a given string: " + map);

        // 7. Iterate through the map entries to print each word and its count separately
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Word: '" + entry.getKey() + "' -> Count: " + entry.getValue());
        }
    }
}
