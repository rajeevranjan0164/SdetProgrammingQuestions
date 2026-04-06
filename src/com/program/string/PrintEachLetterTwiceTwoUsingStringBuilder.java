package com.program.string;

/**
 * --- DRY RUN (Example: "hi") ---
 * String str = "hi"
 * 
 * 1. Loop 1 (ch = 'h'): .append('h').append('h') -> StringBuilder: "hh"
 * 2. Loop 2 (ch = 'i'): .append('i').append('i') -> StringBuilder: "hhii"
 * Final Output: "hhii"
 */
public class PrintEachLetterTwiceTwoUsingStringBuilder {

    public static void main(String[] args) {
        
        // 1. Declare the original input string
        String str = "hello";

        // 2. Use StringBuilder for efficient building of the final string
        StringBuilder stringBuilder = new StringBuilder();
        
        // 3. Convert the string to a character array and iterate through it
        for (char ch : str.toCharArray()) {
            
            // 4. Append the character twice to the StringBuilder
            stringBuilder.append(ch).append(ch);
        }
        
        // 5. Print the final result to the console
        System.out.println(stringBuilder.toString());
    }
}
