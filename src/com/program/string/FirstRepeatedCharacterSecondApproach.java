package com.program.string;

import java.util.HashSet;
import java.util.Set;

/**
 * This program identifies the FIRST character that repeats in a given string.
 * It uses a HashSet for O(1) constant time lookup.
 * 
 * --- DRY RUN (Example: "programming") ---
 * 1. Set seen = []
 * 2. Process 'p': .add('p') is TRUE. Set: [p]
 * 3. Process 'r': .add('r') is TRUE. Set: [p, r]
 * 4. Process 'o': .add('o') is TRUE. Set: [p, r, o]
 * 5. Process 'g': .add('g') is TRUE. Set: [p, r, o, g]
 * 6. Process 'r': .add('r') is FALSE (duplicate). 
 * 7.   Condition !FALSE is TRUE. Print 'r' and BREAK.
 * Final Result: r
 */
public class FirstRepeatedCharacterSecondApproach {

    public static void main(String[] args) {

        // 1. Declare the original input string
        String str = "programming";

        // 2. Normalize the string to lowercase to handle case-insensitivity
        str = str.toLowerCase();

        // 3. Create a HashSet to store each character we encounter
        Set<Character> seenCharacters = new HashSet<>();

        // 4. Iterate through each character of the input string
        for (char ch : str.toCharArray()) {
            
            /** 
             * 5. Logic check:
             *    .add(ch) returns true if the character is new.
             *    ! (NOT) flips that. So if it IS a repeat, the condition is true.
             */
            if (!seenCharacters.add(ch))  {
                
                // 6. Print the character as the first repeated one found
                System.out.println("First repeated character: " + ch);
                
                // 7. Stop the loop immediately
                break;
            }
        }
    }
}
