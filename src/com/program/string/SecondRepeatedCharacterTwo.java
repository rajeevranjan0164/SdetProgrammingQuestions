package com.program.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * This program finds the second distinct character that repeats in a string.
 * 
 * --- DRY RUN (Input: "programming") ---
 * Set: [], repeatCount: 0
 * 1. 'p' -> Not in set. Added.
 * 2. 'r' -> Not in set. Added.
 * 3. 'o' -> Not in set. Added.
 * 4. 'g' -> Not in set. Added.
 * 5. 'r' -> ALREADY IN SET! repeatCount = 1. (First repeat)
 * 6. 'a' -> Not in set. Added.
 * 7. 'm' -> Not in set. Added.
 * 8. 'm' -> ALREADY IN SET! repeatCount = 2. (Second repeat) -> PRINT and EXIT.
 */
public class SecondRepeatedCharacterTwo {

    public static void main(String[] args) {
        String str = "programming";

        // Step 1: Remove all whitespace from the string
        // We must re-assign to 'str' because Strings in Java are immutable
        str = str.replaceAll("\\s+", "");
        
        // Step 2: Use a HashSet to track which characters we've already seen
        Set<Character> seenCharacters = new HashSet<>();
        int repeatCount = 0;

        // Step 3: Iterate through each character
        for (char ch : str.toCharArray()) {
            // HashSet.add() returns false if the element is already present
            if (!seenCharacters.add(ch)) {
                // If it's already in the set, it's a repeat
                repeatCount++;
                
                // Check if this is the 2nd repeated character
                if (repeatCount == 2) {
                    System.out.println("The second repeated character is: " + ch);
                    return; // Exit as soon as we find it
                }
            }
        }
        
        System.out.println("No second repeated character found.");
    }
}
