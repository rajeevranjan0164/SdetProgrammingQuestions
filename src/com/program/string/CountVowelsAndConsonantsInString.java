package com.program.string;

/**
 * This program counts the number of vowels and consonants in a string 
 * and identifies which characters were found in each category.
 * 
 * --- DRY RUN (Example: "A1b") ---
 * String str = "A1b"
 * 
 * 1. Step 1 (Cleanup): str2 = "A1b".toLowerCase().replaceAll("[^a-z]", "") -> "ab"
 * 
 * 2. Loop 1 (i = 0, ch = 'a'):
 *    - ('a' == 'a') is TRUE. -> vowCount=1, vowelsList="a"
 * 
 * 3. Loop 2 (i = 1, ch = 'b'):
 *    - ('b' == vowels) is FALSE. -> consCount=1, consonantsList="b"
 * 
 * Final Output: Vowel Count: 1, Cons Count: 1
 */
public class CountVowelsAndConsonantsInString {

    public static void main(String[] args) {
        
        // 1. Declare the original input string
        String str = "apple is fruit.1233";

        /** 
         * 2. Normalize and clean the string:
         *    - toLowerCase() handles case-insensitivity
         *    - replaceAll("[^a-z]", "") removes everything that is NOT a lowercase letter (numbers, spaces, dots)
         */
        String str2 = str.toLowerCase().replaceAll("[^a-z]", "");

        // 3. Initialize counters for vowels and consonants
        int vowCount = 0;
        int consCount = 0;

        // 4. Use StringBuilders to collect the actual characters found
        StringBuilder vowelsList = new StringBuilder();
        StringBuilder consonantsList = new StringBuilder();

        // 5. Iterate through the cleaned string index by index
        for (int i = 0; i < str2.length(); i++) {

            // 6. Get the character at the current loop index
            char ch = str2.charAt(i);

            // 7. Check if the character is one of the five vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowCount++;                // Increment the vowel counter
                vowelsList.append(ch);     // Add to the list of vowels
            } 
            // 8. Since we already removed all non-letters, anything not a vowel must be a consonant
            else {
                consCount++;               // Increment the consonant counter
                consonantsList.append(ch); // Add to the list of consonants
            }
        }
        
        // 9. Final Output of all collected data
        System.out.println("Total Vowel Count: " + vowCount);
        System.out.println("Total Consonant Count: " + consCount);
        System.out.println("Vowels Found: " + vowelsList.toString());
        System.out.println("Consonants Found: " + consonantsList.toString());
    }
}
