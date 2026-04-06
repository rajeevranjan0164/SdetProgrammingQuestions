package com.program.string;

import java.util.HashSet;
import java.util.Set;

/**
 * --- DRY RUN (Example: "hello world world") ---
 * 1. words array = ["hello", "world", "world"]
 * 2. Process "hello": .add("hello") is TRUE. !TRUE is FALSE. Skip.
 * 3. Process "world": .add("world") is TRUE. !TRUE is FALSE. Skip.
 * 4. Process "world": .add("world") is FALSE (duplicate). !FALSE is TRUE.
 * 5.   "world" is appended to stringBuilder.
 * Final Result: "world "
 */
public class RemoveDuplicateWords {

    public static void main(String[] args) {

        // 1. Declare the input sentence
        String sentence = "hello world world hello java java Rajeev";

       // 2. Split the sentence into an array of words
       String[] words =  sentence.split(" ");

        // 3. Create a HashSet to track which words have been encountered
        Set<String> uniqueWords = new HashSet<>();

        // 4. Create a StringBuilder to accumulate the output
        StringBuilder stringBuilder = new StringBuilder();

        // 5. Iterate through each word in the array
        for (String str : words) {
            
            /** 
             * 6. Logic check:
             *    .add(str) returns true if the word is new.
             *    We use '!' to flip this. So if it IS a duplicate, the condition is true.
             */
            if (!uniqueWords.add(str)) {
                
                // 7. If the word is a duplicate, add it to the final string
                stringBuilder.append(str).append(" ");
            }
        }
        
        // 8. Print the final result
        System.out.println(stringBuilder.toString());
    }
}
