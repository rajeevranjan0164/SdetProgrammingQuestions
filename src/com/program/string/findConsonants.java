package com.program.string;

public class findConsonants {

    /*
    START

    // Step 1: Input string
    INPUT str  // Example: "Hello World!"

    // Step 2: Convert string to lowercase for uniformity
    CONVERT str to lowercase

    // Step 3: Define vowels
    SET vowels = "aeiou"

    // Step 4: Iterate through each character in str
    FOR each character ch in str
        IF ch is a letter AND ch is NOT in vowels
            PRINT ch + " "  // Print consonant
    END FOR

    END
*/

    public static void main(String[] args) {
        String str = "Hello World!";

        str.toLowerCase();

        String vowel = "aeiou";

        StringBuilder stringBuilder = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch) && vowel.indexOf(ch) == -1) {
                stringBuilder.append(ch);
                System.out.println(ch+ " ");
            }
        }
        System.out.println(stringBuilder.toString());

    }
}
