package com.program.string;

import java.util.HashSet;
import java.util.Set;

/**
 * --- DRY RUN (Example: "hello") ---
 * 1. Set uniqueChar = []
 * 2. Process 'h': .add('h') is TRUE. Print 'h'. Set: [h]
 * 3. Process 'e': .add('e') is TRUE. Print 'e'. Set: [h, e]
 * 4. Process 'l': .add('l') is TRUE. Print 'l'. Set: [h, e, l]
 * 5. Process 'l': .add('l') is FALSE (duplicate). Skip.
 * 6. Process 'o': .add('o') is TRUE. Print 'o'. Set: [h, e, l, o]
 * Final Output: "helo"
 */
public class RemoveDuplicateString {

    public static void main(String[] args) {
        
        // 1. Declare the original word
        String word = "hello";

        // 2. Create a HashSet to store only unique characters
        Set<Character> uniqueChar = new HashSet<>();

        // 3. Convert the string to a character array and iterate through it
        for (char ch : word.toCharArray()) {
            
            /** 
             * 4. Logic check:
             *    .add(ch) returns true if the character is NOT already in the set.
             *    If it returns true, we print the character immediately.
             */
            if (uniqueChar.add(ch)) {
                // 5. Print the unique character on the same line
                System.out.print(ch);
            }
        }
    }
}
