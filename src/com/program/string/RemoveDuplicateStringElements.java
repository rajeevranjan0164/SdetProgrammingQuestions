package com.program.string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateStringElements {
    /*
    We iterate through each character in the word.
    We use a HashSet seen to keep track of encountered characters. Since Sets do not allow duplicate elements, if add() returns false, it means the character is a duplicate.
    If add() returns false, we print the character as a duplicate.
    This approach has a time complexity of O(n), where n is the length of the word, as it iterates through the characters only once. Additionally, it uses a HashSet for efficient lookup and insertion.
     */

    public static void main(String[] args) {
        String word = "hello";

        System.out.println("Duplicate characters in the word:");
        findDuplicates(word);
    }

    public static void findDuplicates(String word) {
        Set<Character> seen = new HashSet<>();

        for (char ch : word.toCharArray()) {
            if (seen.add(ch)) {
                System.out.print(ch);
            }
        }
    }
}
