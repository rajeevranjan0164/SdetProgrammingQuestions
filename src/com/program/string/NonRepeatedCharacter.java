package com.program.string;

/*
    START

    // Step 1: Input string
    INPUT str  // Example: "programming"

    // Step 2: Convert string to lowercase for uniformity
    CONVERT str to lowercase

    // Step 3: Create an empty HashMap to store character frequencies
    CREATE HashMap charCount

    // Step 4: Iterate through each character in str
    FOR each character ch in str
        IF ch is already in charCount
            Increment the count of ch by 1
        ELSE
            Add ch to charCount with a count of 1
    END FOR

    // Step 5: Find and print all non-repeated characters along with their count
    FOR each entry (character, count) in charCount
        IF count is 1
            PRINT "Non-repeated character: " + character
            PRINT "Count: 1"
    END FOR

    // Step 6: If no non-repeated character is found
    IF no non-repeated characters found
        PRINT "No non-repeated characters found."

    END
*/


import java.util.HashMap;
import java.util.Map;

public class NonRepeatedCharacter {

    public static void main(String[] args) {

        String str = "programming"; // Example string

        int count =0;

        str = str.toLowerCase();

        Map<Character, Integer> charCount = new HashMap<>();

        // Populate the HashMap with character frequencies
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0)+1);
        }

        // Find and print all non-repeated characters along with their count

       for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
           if (entry.getValue() == 1) {
               System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
           }
       }

    }
}
