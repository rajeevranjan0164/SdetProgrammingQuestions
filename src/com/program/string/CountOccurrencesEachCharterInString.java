package com.program.string;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesEachCharterInString {

    public static void main(String[] args) {

        String str = "Test Automation Java Automation"; // Original string


        // Remove all whitespace characters and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        System.out.println(str);
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);

        }
        System.out.println(map);

        for (Map.Entry<Character, Integer> integerEntry : map.entrySet()) {
            System.out.println(" " +integerEntry.getKey() + ":: "+integerEntry.getValue());
        }
    }
}
