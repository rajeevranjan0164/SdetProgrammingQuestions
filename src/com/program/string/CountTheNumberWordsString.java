package com.program.string;

/**
 * This program counts the total number of words in a given sentence.
 * 
 * --- DRY RUN (Example: " Java  is Fun ") ---
 * 1. str = " Java  is Fun "
 * 2. .trim() -> "Java  is Fun" (Removes spaces from the very ends)
 * 3. .split("\\s+") -> ["Java", "is", "Fun"] (Splits by one or more spaces)
 * 4. strArray.length = 3
 * Final Output: 3
 */
public class CountTheNumberWordsString {

    public static void main(String[] args) {

        // 1. Declare the input string to be processed
        String str = "Test Automation Java Automation";

        // 2. Normalize and split the string:
        //    - trim() removes leading/trailing spaces
        //    - split("\\s+") splits the string by one or more whitespace characters
        String[] strArray = str.trim().split("\\s+");

        // 3. The length of the resulting array is equal to the number of words
        int wordCount = strArray.length;

        // 4. Print the total word count to the console
        System.out.println("Total Number of Words: " + wordCount);
    }
}
