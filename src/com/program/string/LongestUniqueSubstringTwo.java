package com.program.string;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstringTwo {

    public static void main(String[] args) {
        String input = "abcabcbb";

        Set<Character> characterSet = new HashSet<>();


        for (char ch : input.toCharArray()) {
            if (!characterSet.add(ch)) {
                characterSet.add(ch);
            }
        }
        System.out.println(characterSet);
    }

   /* String s = "abcabcbb";
    Set<Character> set = new HashSet<>();
    int start = 0;
    int maxLength = 0;
    int maxStart = 0;*/

/*for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);

        while (set.contains(ch)) {
            set.remove(s.charAt(start));
            start++;
        }

        set.add(ch);

        if (i - start + 1 > maxLength) {
            maxLength = i - start + 1;
            maxStart = start;
        }
    }

    // Print longest substring
    String longestSubstring = s.substring(maxStart, maxStart + maxLength);
System.out.println("Longest Unique Substring: " + longestSubstring);
System.out.println("Length: " + maxLength);*/

}
