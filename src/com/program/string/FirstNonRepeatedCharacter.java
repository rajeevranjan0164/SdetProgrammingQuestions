package com.program.string;

import java.util.HashMap;
import java.util.Map;

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

    // Step 5: Find and print the first non-repeated character along with its count
    FOR each character ch in str
        IF the count of ch is 1
            PRINT "First non-repeated character: " + ch
            PRINT "Count: " + count  // Count will always be 1
            RETURN
    END FOR

    // Step 6: If no non-repeated character is found
    PRINT "No non-repeated character found."

    END
*/

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String str = "programming"; // Example string
        printRepeatedCharacters(str);
    }

    public static void printRepeatedCharacters(String str) {
        // Convert the string to lower case to handle case insensitivity
        str = str.toLowerCase();

        // Create a HashMap to store character frequencies
        Map<Character, Integer> charCount = new HashMap<>();

        // Populate the HashMap with character frequencies
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Print characters with a count greater than 1
        System.out.println("Repeated characters:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
