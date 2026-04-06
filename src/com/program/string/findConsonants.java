package com.program.string;

/**
 * This program identifies and collects all consonant characters in a given string.
 * 
 * --- DRY RUN (Example: "Hi!") ---
 * 1. Original String: "Hi!"
 * 2. str = str.toLowerCase() -> "hi!"
 * 3. vowel string = "aeiou"
 * 
 * 4. Process 'h': Character.isLetter('h') is TRUE.
 *    - vowel.indexOf('h') is -1 (not a vowel). -> Append 'h' to builder.
 * 5. Process 'i': Character.isLetter('i') is TRUE.
 *    - vowel.indexOf('i') is 2 (is a vowel). -> Skip.
 * 6. Process '!': Character.isLetter('!') is FALSE. -> Skip.
 * 
 * Final Result: "h"
 */
public class FindConsonants {

    public static void main(String[] args) {
        
        // 1. Declare the input string
        String str = "Hello World!";

        // 2. Convert to lowercase (Must re-assign because Strings are immutable)
        str = str.toLowerCase();

        // 3. Define the vowels for easy lookup
        String vowel = "aeiou";

        // 4. Use StringBuilder to collect consonants efficiently
        StringBuilder stringBuilder = new StringBuilder();

        // 5. Iterate through each character of the normalized string
        for (char ch : str.toCharArray()) {
            
            /** 
             * 6. Logic check:
             *    - Character.isLetter(ch) ensures we only look at A-Z
             *    - vowel.indexOf(ch) == -1 ensures the letter is NOT a vowel
             */
            if (Character.isLetter(ch) && vowel.indexOf(ch) == -1) {
                
                // 7. Add the consonant to the StringBuilder
                stringBuilder.append(ch);
            }
        }
        
        // 8. Print the final collected consonants
        System.out.println("Consonants found: " + stringBuilder.toString());
    }
}
