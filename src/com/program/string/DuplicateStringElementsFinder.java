package com.program.string;

import java.util.HashSet;
import java.util.Set;

/**
 * This program identifies duplicate characters in a string using two different approaches.
 * Both approaches utilize HashSets to track seen characters and identify repeats.
 * 
 * --- DRY RUN (Example: "hello") ---
 * 
 * Approach 1 (Direct Print):
 * 1. Process 'h', 'e', 'l': Added to set.
 * 2. Process 'l': Already in set! -> Print 'l'
 * 3. Process 'o': Added to set.
 * 
 * Approach 2 (Collection Print):
 * 1. Process 'h', 'e', 'l': Added to stringSet1.
 * 2. Process 'l': Already in stringSet1! -> Add 'l' to stringSet2.
 * 3. Process 'o': Added to stringSet1.
 * 4. Final: Print stringSet2 -> [l]
 */
public class DuplicateStringElementsFinder {

    public static void main(String[] args) {

        // --- APPROACH 1: Printing duplicates directly using a loop ---
        
        // 1. Declare the input word to be checked
        String word = "hello";

        // 2. Create a HashSet to track which characters have been seen so far
        Set<Character> stringSet = new HashSet<>();

        // 3. Convert the word to a character array and iterate through it
        for (char ch : word.toCharArray()) {
            
            // 4. .add(ch) returns false if the character is already in the set
            // The '!' operator flips this, so the condition is true for duplicates
            if (!stringSet.add(ch)) {
                
                // 5. Print the duplicate character as soon as it is detected
                System.out.println(ch);
            }
        }

        // --- APPROACH 2: Collecting duplicates into a separate Set before printing ---

        // 6. Convert the same word into a character array for indexed access
        char[] chr = word.toCharArray();

        // 7. stringSet1 tracks all unique characters seen during this second iteration
        Set<Character> stringSet1 = new HashSet<>();
        
        // 8. stringSet2 is used specifically to store ONLY the duplicate characters
        Set<Character> stringSet2 = new HashSet<>();

        // 9. Iterate through the character array using a standard for loop
        for (int i = 0; i < chr.length; i++) {
            
            // 10. Get the character at the current loop index 'i'
            char c = chr[i];
            
            // 11. If adding to stringSet1 fails, the character 'c' is a duplicate
            if (!stringSet1.add(c)) {
                
                // 12. Add the duplicate character into our separate collection (stringSet2)
                stringSet2.add(c);
            }
        }
        
        // 13. Print the entire set containing all unique duplicate characters found
        System.out.println(stringSet2);
    }
}
