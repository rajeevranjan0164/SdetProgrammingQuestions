package com.program.string;

/**
 * --- DRY RUN (Example: "Java") ---
 * String str = "Java"
 * indices: 0:'J', 1:'a', 2:'v', 3:'a'
 * 
 * 1. Loop i = 0: (0 % 2 == 0) is TRUE. Print 'J'.
 * 2. Loop i = 1: (1 % 2 == 0) is FALSE. (Skip).
 * 3. Loop i = 2: (2 % 2 == 0) is TRUE. Print 'v'.
 * 4. Loop i = 3: (3 % 2 == 0) is FALSE. (Skip).
 * Final Output: J, v
 */
public class PrintEvenIndexedCharacters {

    public static void main(String[] args) {

        // 1. Declare the input string to be processed
        String str = "Automation";

        // 2. Start a loop that goes through every index of the string
        for (int i = 0; i < str.length(); i++) {
            
            // 3. Check if the current index 'i' is an even number (0, 2, 4, etc.)
            if (i % 2 == 0) {
                
                // 4. If index is even, print the character at that position
                System.out.println(str.charAt(i));
            }
        }
    }
}
