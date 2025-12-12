package com.program.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueCharactersTwo {


    public static void main(String[] args) {
        String str = "Java Automation";

        Map<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character,Integer> map : charCount.entrySet()) {
            if (map.getValue()==1) {
                System.out.print(map.getKey());
            }
        }
    }
}
