package com.program.string;

/**
 * --- DRY RUN (Example: "hi") ---
 * String str = "hi"
 * 
 * 1. Loop 1 (ch = 'h'): Prints ('h' + "" + 'h') -> Output: "hh"
 * 2. Loop 2 (ch = 'i'): Prints ('i' + "" + 'i') -> Output: "hhii"
 * Final Output: "hhii"
 */
public class PrintEachLetterTwice {

    public static void main(String[] args) {

        // 1. Declare the original input string
        String str = "hello";

        // 2. Convert the string to a character array and iterate through it
        for (char ch : str.toCharArray()) {
            
            // 3. Print the current character twice consecutively
            // The empty string "" ensures that characters are treated as text, not numbers
            System.out.print(ch + "" + ch); 
        }
    }
}
