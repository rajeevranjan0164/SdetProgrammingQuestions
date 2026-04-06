package com.program.string;

/**
 * --- DRY RUN (Example: "Hi!") ---
 * 1. Original String: "Hi!"
 * 2. .replaceAll("\\s", "") and toLowerCase() -> str: "hi!"
 * 3. Process 'h': Character.isLetter('h') is TRUE. 
 *    - Is NOT ('a','e','i','o','u')? TRUE. -> Print 'h'
 * 4. Process 'i': Character.isLetter('i') is TRUE.
 *    - Is NOT ('a','e','i','o','u')? FALSE (it is 'i'). -> Skip
 * 5. Process '!': Character.isLetter('!') is FALSE. -> Skip
 * Final Output: "h"
 */
public class FindConsonantsSecondApproach {

    public static void main(String[] args) {
        
        // 1. Declare the input string
        String str = "Hello World!";

        // 2. Remove all spaces and convert the string to lowercase
        str = str.replaceAll("\\s", "").toLowerCase();

        // 3. Iterate through each character of the normalized string
        for (char ch : str.toCharArray()) {
            
            // 4. First, check if the character is a valid letter (A-Z)
            if (Character.isLetter(ch)) {
                
                // 5. If it is NOT a vowel (a, e, i, o, u), it must be a consonant
                if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                    
                    // 6. Print the consonant character
                    System.out.print(ch);
                }
            }
        }
    }
}
