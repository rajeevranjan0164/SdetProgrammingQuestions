package com.program.string;

/**
 * This program collects characters at even indices (0, 2, 4, etc.) 
 * using a StringBuilder for efficiency.
 * 
 * --- DRY RUN (Example: "Java") ---
 * indices: 0:'J', 1:'a', 2:'v', 3:'a'
 * 
 * 1. i = 0: Append 'J' -> stringBuilder: "J"
 * 2. i = 2: Append 'v' -> stringBuilder: "Jv"
 * 3. i = 4: (4 < 4) is FALSE. Loop ends.
 * Final Output: Jv
 */
public class EvenIndexedCharactersUsingStringBuilder {

    public static void main(String[] args) {

        // 1. Declare the input string
        String str = "Automation";

        // 2. Initialize a StringBuilder to efficiently store the result
        StringBuilder stringBuilder = new StringBuilder();
        
        // 3. Start a loop at index 0 and increment by 2 in each step
        // This ensures we only visit even positions (0, 2, 4, etc.)
        for (int i = 0; i < str.length(); i += 2) {
            
            // 4. Get the character at the current even index and append it
            stringBuilder.append(str.charAt(i));
        }

        // 5. Print the final collected characters
        System.out.println("Even indexed characters: " + stringBuilder.toString());
    }
}
