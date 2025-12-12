package com.program.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "Java Automation";

        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        StringBuilder stringBuilder = new StringBuilder();

        // Print characters that appear only once, with spaces
        System.out.print("Unique characters: ");
        for (char ch : str.toCharArray()) {
            if (charCount.get(ch) == 1) {
                System.out.print(ch + " "); // Print character with space
            }
        }



    }
}
