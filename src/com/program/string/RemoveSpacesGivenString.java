package com.program.string;

/**
 * This program removes all space characters from a given string.
 * 
 * --- DRY RUN (Example: "Hi All") ---
 * 1. Original String: "Hi All"
 * 2. .replaceAll("\\s", "") looks for every whitespace character
 * 3. The space between 'i' and 'A' is found and replaced with nothing.
 * 4. Final Output: "HiAll"
 */
public class RemoveSpacesGivenString {

    public static void main(String[] args) {

        // 1. Declare the original string with spaces
        String str = "Welcome to Java World";

        /** 
         * 2. Use replaceAll() with the regex "\\s"
         *    "\\s" is a regular expression that matches any whitespace (space, tab, etc.)
         *    We replace every match with an empty string ("").
         */
       String removeSpace =  str.replaceAll("\\s", "");

        // 3. Print the final result to the console
        System.out.println("String without spaces: " + removeSpace);
    }
}
