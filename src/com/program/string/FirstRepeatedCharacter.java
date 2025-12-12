package com.program.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String str = "programming"; // Example string
        printRepeatedCharacters(str);
    }

    public static void printRepeatedCharacters(String str) {
        // Convert the string to lower case to handle case insensitivity
        str = str.toLowerCase();

        // Create a HashMap to store character frequencies
        Map<Character, Integer> charCount = new HashMap<>();

        // Populate the HashMap with character frequencies

        char[] chArray = str.toCharArray();
        for (char ch : chArray) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        System.out.println(charCount);
        // Print characters with a count greater than 1
        System.out.println("non Repeated characters:");


        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
