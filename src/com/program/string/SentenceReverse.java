package com.program.string;

/**
 * This program performs a full reversal of a sentence:
 * 1. It reverses the order of the words.
 * 2. It reverses the characters within each word.
 * 
 * --- DRY RUN (Example: "Java is fun") ---
 * Input String: "Java is fun"
 * Step 1: words array = ["Java", "is", "fun"]
 * 
 * Step 2: Outer Loop (i = 2, which is "fun")
 *    - Inner Loop (j = 2,1,0): Appends 'n', 'u', 'f' -> Result: "nuf"
 *    - Add space -> Result: "nuf "
 * 
 * Step 3: Outer Loop (i = 1, which is "is")
 *    - Inner Loop (j = 1,0): Appends 's', 'i' -> Result: "nuf si"
 *    - Add space -> Result: "nuf si "
 * 
 * Step 4: Outer Loop (i = 0, which is "Java")
 *    - Inner Loop (j = 3,2,1,0): Appends 'a', 'v', 'a', 'J' -> Result: "nuf si avaJ"
 *    - (i > 0 is false, no space added)
 * 
 * Final Output: "nuf si avaJ"
 */
public class SentenceReverse {

    public static void main(String[] args) {
        String str = "India is a great democratic country and the capital is Delhi";

        // Step 1: Split the sentence into words based on spaces
        String[] words = str.split(" ");
        
        // Use StringBuilder for efficient string manipulation
        StringBuilder fullyReversed = new StringBuilder();

        // Step 2: Loop backwards through the words array to reverse word order
        // Starting at words.length - 1 (the last word) and moving to 0
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            
            // Step 3: Use a nested loop to reverse the characters of the current word
            // Starting at word.length() - 1 (the last char) and moving to 0
            for (int j = word.length() - 1; j >= 0; j--) {
                fullyReversed.append(word.charAt(j));
            }

            // Step 4: Add a space between the words, but not after the last word
            if (i > 0) {
                fullyReversed.append(" ");
            }
        }

        System.out.println("Original: " + str);
        System.out.println("Fully Reversed: " + fullyReversed.toString());
    }
}
