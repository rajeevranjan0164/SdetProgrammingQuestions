package com.program.string;

public class CountVowelsAndConsonantsInString {

    public static void main(String[] args) {
        /*
    START
    // Step 1: Input string
    str = "Hello, World! 123"  // Input can be provided by user

    // Step 2: Transform the string
    alpha = Convert str to lowercase
    alpha = Remove all non-alphabetic characters from alpha

    // Step 3: Initialize counters
    vowels = 0
    consonants = 0

    // Step 4: Iterate through each character in the transformed string
    FOR each character ch in alpha
        IF ch is a vowel (a, e, i, o, u)
            Increment vowels
        ELSE
            Increment consonants
    END FOR

    // Step 5: Print the result
    PRINT "Given string vowels: " + vowels
    PRINT "Given string consonants: " + consonants
    END
*/

        String str = "apple is fruit.1233";

        String str2 = str.replaceAll("[^a-z]", "").toLowerCase();

        int vow = 0;
        int cons = 0;

        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();

        for (int i =0; i<str2.length();i++) {
            char ch = str2.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vow++;
                stringBuilder.append(ch).toString();
            } else {
                cons++;
                stringBuilder1.append(ch);
            }
        }
        // Step 6: Print the result
        System.out.println("Given string vowels: " + vow);
        System.out.println("Given string consonants: " + cons);

        System.out.println("Given string vowels: " + stringBuilder.toString());
        System.out.println("Given string consonants: " + stringBuilder1.toString());
    }
}
