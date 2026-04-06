package com.program.string;

import java.util.HashSet;
import java.util.Set;

/**
 * This program identifies the second distinct character that repeats in a given string.
 * It uses a HashSet for O(1) lookup and stops as soon as the result is found.
 * 
 * --- DRY RUN (Input: "programming") ---
 * Set: [p, r, o, g], repeatCount: 0
 * 1. 'r' -> Already in Set. repeatCount = 1.
 * 2. 'a' -> New. Set: [p, r, o, g, a]
 * 3. 'm' -> New. Set: [p, r, o, g, a, m]
 * 4. 'm' -> Already in Set. repeatCount = 2. -> PRINT 'm' and BREAK.
 */
public class SecondRepeatedCharacter {

    public static void main(String[] args) {
        String str = "programming";

        // Step 1: Normalize string to lowercase
        str = str.toLowerCase();

        int repeatCount = 0;
        Set<Character> seenCharacters = new HashSet<>();

        // Step 2: Iterate through characters to find the second repeat
        for (char ch : str.toCharArray()) {
            // HashSet.add() returns false if the character is already present in the Set
            if (!seenCharacters.add(ch)) {
                repeatCount++;
                
                // If this is the 2nd repeated character found
                if (repeatCount == 2) {
                    System.out.println("Second repeated character: " + ch);
                    break; // STOP the loop immediately!
                }
            }
        }
    }
}
