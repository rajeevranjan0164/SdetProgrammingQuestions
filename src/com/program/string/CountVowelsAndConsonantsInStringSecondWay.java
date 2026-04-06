package com.program.string;

import java.util.ArrayList;
import java.util.List;

/**
 * This program counts the number of vowels and consonants in a string 
 * and identifies which characters were found in each category.
 * 
 * --- DRY RUN (Example: "a1b") ---
 * String str = "a1b" -> normalized to "a1b"
 * 
 * 1. Loop 1 (ch = 'a'): 
 *    - Character.isLetter('a') is TRUE.
 *    - ('a' == 'a') is TRUE. -> vowelCount=1, listVowel=["a"]
 * 
 * 2. Loop 2 (ch = '1'):
 *    - Character.isLetter('1') is FALSE. -> Skip.
 * 
 * 3. Loop 3 (ch = 'b'):
 *    - Character.isLetter('b') is TRUE.
 *    - ('b' == vowels) is FALSE. -> consCount=1, listCons=["b"]
 * 
 * Final Output: Vowel: 1, Cons: 1
 */
public class CountVowelsAndConsonantsInStringSecondWay {

    public static void main(String[] args) {
        
        // 1. Declare the original input string
        String str = "apple is fruit.1233";

        // 2. Normalize string to lowercase for case-insensitivity
        str = str.toLowerCase();

        // 3. Variables to store the counts of vowels and consonants
        int vowelCount = 0;
        int consCount = 0;

        // 4. Lists to store the actual characters found
        List<Character> listVowel = new ArrayList<>();
        List<Character> listCons = new ArrayList<>();

        // 5. Iterate through each character of the normalized string
        for (char ch : str.toCharArray()) {
            
            // 6. Check if the character is a letter (A-Z)
            if (Character.isLetter(ch)) {
                
                // 7. Check if the character is one of the five vowels
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;            // Increment the vowel count
                    listVowel.add(ch);       // Add the vowel to the vowel list
                } 
                // 8. If character is a letter but not a vowel, it's a consonant
                else {
                    consCount++;             // Increment the consonant count
                    listCons.add(ch);        // Add the consonant to the consonant list
                }
            }
        }
        
        // 9. Final Output of the results
        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consCount);
        System.out.println("Vowels found: " + listVowel);
        System.out.println("Consonants found: " + listCons);
    }
}
