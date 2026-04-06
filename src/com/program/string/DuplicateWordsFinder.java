package com.program.string;

import java.util.HashSet;
import java.util.Set;

/**
 * This program identifies and prints all words that appear more than once in a sentence.
 * 
 * --- DRY RUN (Example: "hi hello hi") ---
 * 1. Words array: ["hi", "hello", "hi"]
 * 2. Process "hi": Added to uniqueSet. [uniqueSet: {hi}]
 * 3. Process "hello": Added to uniqueSet. [uniqueSet: {hi, hello}]
 * 4. Process "hi": Already in uniqueSet! Added to duplicateWords. [duplicateWords: {hi}]
 * Final Output: "hi "
 */
public class DuplicateWordsFinder {

    public static void main(String[] args) {

        // 1. Declare the input sentence
        String str = "hello world world hello java java Rajeev";

        // 2. Call the static method to find and print duplicates
        findDuplicates(str);
    }

    public static void findDuplicates(String str) {

        // 3. Convert string to lowercase and split it into an array of words
        // "\\s+" is a regex that handles one or more spaces
        String[] words = str.toLowerCase().split("\\s+");

        // 4. HashSet to keep track of all words encountered
        Set<String> uniqueSet = new HashSet<>();
        
        // 5. HashSet to store only the words that are repeats
        Set<String> duplicateWords = new HashSet<>();

        // 6. Iterate through the array of words
        for (String word : words) {
            
            // 7. .add() returns false if the word is already in the uniqueSet
            if (!uniqueSet.add(word)) {
                
                // 8. If it's a duplicate, add it to our duplicateWords collection
                duplicateWords.add(word);
            }
        }

        // 9. Check if we found any duplicates
        if (duplicateWords.isEmpty()) {
            System.out.println("No duplicate words found.");
        } else {
            // 10. Print the set of duplicate words found
            System.out.println("Duplicate words found:");
            for (String word : duplicateWords) {
                System.out.print(word + " ");
            }
        }
    }
}
