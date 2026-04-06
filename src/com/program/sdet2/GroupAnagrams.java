package com.program.sdet2;

import java.util.*;

/**
 * --- SDET 2 QUESTION: Group Anagrams ---
 * 
 * The Goal: Given an array of strings, group the anagrams together.
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * Output: [["ate","eat","tea"], ["nat","tan"], ["bat"]]
 * 
 * --- SENIOR CONSIDERATIONS ---
 * 1. Complexity: O(N * K log K) where N is the number of strings and K is 
 *    the maximum length of a string (due to sorting).
 * 2. Map Categorization: Use HashMap<String, List<String>>.
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> grouped = groupAnagrams(strs);
        System.out.println("Grouped Anagrams: " + grouped);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        // Map key is the sorted word, value is a list of all its anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // 1. Sort the characters of the current string to create a "key"
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);

            // 2. Add the original string to the list corresponding to that sorted key
            // If the key doesn't exist yet, create a new list.
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        // 3. Return all the lists from the Map
        return new ArrayList<>(map.values());
    }
}
