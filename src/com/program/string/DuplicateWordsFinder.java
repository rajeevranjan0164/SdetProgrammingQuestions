package com.program.string;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordsFinder {

    /*
    START
    // Step 1: Input the string
    str = "input string"

    // Step 2: Convert the string to lowercase for case insensitivity
    str = str.toLowerCase()

    // Step 3: Split the string into words using whitespace as the delimiter
    words = str.split("\\s+")

    // Step 4: Create two empty HashSets to track unique and duplicate words
    uniqueWords = new HashSet()
    duplicateWords = new HashSet()

    // Step 5: Iterate through each word in the array
    FOR each word in words
        // Step 6: Try to add the word to the uniqueWords HashSet
        IF word is not added to the HashSet (i.e., add() returns false)
            // Step 7: Word is a duplicate, add it to the duplicateWords HashSet
            duplicateWords.add(word)

    END FOR

    // Step 8: Check if there are duplicates
    IF duplicateWords is empty
        PRINT "No duplicate words found."
    ELSE
        // Step 9: Print each duplicate word
        FOR each word in duplicateWords
            PRINT word

    END IF

    // The algorithm finishes processing the string
END

Explanation:
- **Input**: The input string (`str`) is given.
- **String Transformation**: The string is converted to lowercase to handle case insensitivity.
- **Splitting**: The string is split into words based on whitespace.
- **HashSets**: Two HashSets (`uniqueWords` and `duplicateWords`) are created. `uniqueWords` stores the words we've encountered, and `duplicateWords` stores those that appear more than once.
- **Iteration**: We iterate over each word in the array and check if it already exists in `uniqueWords`. If it does, we add it to `duplicateWords`.
- **Output**: The program prints the duplicate words in the order of their first occurrence. If no duplicates are found, it prints "No duplicate words found."
*/

    public static void main(String[] args) {

        String str = "hello world world hello java java Rajeev";

        //System.out.println("Duplicate words in the string:");
        findDuplicates(str);

    }

    public static void findDuplicates(String str) {

        String[] str1 = str.toLowerCase().split("\\s+");
        Set<String> uniqueSet = new HashSet<>();
        Set<String> duplicateWords = new HashSet<>();

        for (String str2 : str1) {
            if (!uniqueSet.add(str2)) {
                duplicateWords.add(str2);
            }
        }
        if (duplicateWords.isEmpty()) {
            System.out.println("No duplicate words found.");
        } else {
            // Print duplicate words
            for (String word : duplicateWords) {
                System.out.print(word + " ");
            }
        }
    }

}
