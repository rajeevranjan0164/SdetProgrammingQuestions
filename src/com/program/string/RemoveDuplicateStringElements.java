package com.program.string;

import java.util.HashSet;
import java.util.Set;

/**
 * This program removes duplicate characters from a string.
 * 
 * --- DRY RUN (Example: "hello") ---
 * 1. Set seen = []
 * 2. Process 'h': .add('h') is TRUE. Print 'h'. Set: [h]
 * 3. Process 'e': .add('e') is TRUE. Print 'e'. Set: [h, e]
 * 4. Process 'l': .add('l') is TRUE. Print 'l'. Set: [h, e, l]
 * 5. Process 'l': .add('l') is FALSE. (Skip printing).
 * 6. Process 'o': .add('o') is TRUE. Print 'o'. Set: [h, e, l, o]
 * Final Output: "helo"
 */
public class RemoveDuplicateStringElements {

    public static void main(String[] args) {
        
        // 1. Declare the input word
        String word = "hello";

        // 2. Print a descriptive label for the output
        System.out.println("Word after removing duplicates:");
        
        // 3. Call the static method to process the word
        findDuplicates(word);
    }

    public static void findDuplicates(String word) {
        
        // 4. Create a HashSet to track which characters have been seen
        Set<Character> seen = new HashSet<>();

        // 5. Iterate through each character in the word
        for (char ch : word.toCharArray()) {
            
            /** 
             * 6. Logic check:
             *    .add(ch) returns true if the character is new.
             *    If true, we process and print it.
             */
            if (seen.add(ch)) {
                
                // 7. Print the unique character
                System.out.print(ch);
            }
        }
    }
}
