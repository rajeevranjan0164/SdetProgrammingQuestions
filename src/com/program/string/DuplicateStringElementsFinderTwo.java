package com.program.string;

import java.util.HashSet;
import java.util.Set;

/**
 * This program identifies duplicate characters in a string by using a HashSet.
 * A character is a duplicate if the HashSet's add() method returns false.
 * 
 * --- DRY RUN (Example: "hello") ---
 * String word = "hello"
 * 
 * 1. Process 'h': set.add('h') is TRUE. [set: {h}]
 * 2. Process 'e': set.add('e') is TRUE. [set: {h, e}]
 * 3. Process 'l': set.add('l') is TRUE. [set: {h, e, l}]
 * 4. Process 'l': set.add('l') is FALSE. (!FALSE is TRUE). Duplicate! -> Print 'l'
 * 5. Process 'o': set.add('o') is TRUE. [set: {h, e, l, o}]
 * 
 * Final Output: "l"
 */
public class DuplicateStringElementsFinderTwo {

    public static void main(String[] args) {
        
        // 1. Declare the input word to check for duplicates
        String word = "hello";

        // 2. Print a descriptive label for the output
        System.out.println("Duplicate characters in the word:");
        
        // 3. Call the static method to process the word and find duplicates
        findDuplicates(word);
    }

    public static void findDuplicates(String word) {

        // 4. Initialize a HashSet to store unique characters encountered
        Set<Character> set = new HashSet<>();

        // 5. Convert the word to a character array and iterate through it
        for (char ch : word.toCharArray()) {
            
            /** 
             * 6. Logic check:
             *    set.add(ch) returns true if the character is new.
             *    We use '!' to check if it's already in the set (returns false).
             */
            if (!set.add(ch)) {
                
                // 7. If the character is already in the set, print it as a duplicate
                System.out.println(ch);
            }
        }
    }
}
