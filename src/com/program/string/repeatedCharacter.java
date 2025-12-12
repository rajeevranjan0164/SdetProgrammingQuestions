package com.program.string;

import java.util.HashMap;
import java.util.Map;

public class repeatedCharacter {

    public static void main(String[] args) {
        String str = "programming"; // Example string

        Map<Character, Integer> charCount = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) +1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() != 1) {
                System.out.println("Repeated char count " + entry.getKey());
            }
        }
     }
}
