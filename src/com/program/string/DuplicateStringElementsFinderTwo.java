package com.program.string;

import java.util.HashSet;
import java.util.Set;

public class DuplicateStringElementsFinderTwo {

    /*
    We iterate through each character in the word.
    We use a HashSet seen to keep track of encountered characters. Since Sets do not allow duplicate elements, if add() returns false, it means the character is a duplicate.
    If add() returns false, we print the character as a duplicate.
    This approach has a time complexity of O(n), where n is the length of the word, as it iterates through the characters only once. Additionally, it uses a HashSet for efficient lookup and insertion.
     */

    /*
    Explanation:
seen.add(ch) tries to add ch to the set.

If ch is not yet in the set → returns true

If ch is already in the set → returns false → duplicate detected
     */

    public static void main(String[] args) {
        String word = "hello";

        System.out.println("Duplicate characters in the word:");
        findDuplicates(word);
    }

    public static void findDuplicates(String word) {

        Set<Character> set = new HashSet<>();

        for (char ch : word.toCharArray()) {
            if (!set.add(ch)) {
                System.out.println(ch);
            }
        }
    }
}
