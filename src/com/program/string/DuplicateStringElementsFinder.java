package com.program.string;

import java.util.HashSet;
import java.util.Set;

public class DuplicateStringElementsFinder {

/*
    START
    // Step 1: Input the word
    word = "input string"

    // Step 2: Create an empty HashSet to keep track of seen characters
    seen = new HashSet()

    // Step 3: Iterate through each character in the word
    FOR each character ch in word
        // Step 4: Try to add the character to the HashSet
        IF ch is not added to the HashSet (i.e., add() returns false)
            // Step 5: Character is a duplicate, print it
            PRINT ch

    END FOR

    // The algorithm finishes checking all characters
END

Explanation:
- **Input**: The input word (string) is given as input to the program.
- **HashSet**: An empty HashSet (`seen`) is created to track the characters that have already been encountered during iteration.
- **Iteration**: The program iterates through each character in the word.
- **Duplicate Check**: The `add()` method is used to add each character to the HashSet. If `add()` returns `false`, it indicates the character is a duplicate, and the character is printed.
- **Output**: Duplicates are printed in the order of their first occurrence.
*/

    public static void main(String[] args) {

        String word = "hello";

        Set<Character> stringSet = new HashSet<>();

        for (char ch : word.toCharArray()) {
            if (!stringSet.add(ch)) {
                System.out.println(ch);
            }
        }

        char[] chr = word.toCharArray();

        Set<Character> stringSet1 = new HashSet<>();
        Set<Character> stringSet2 = new HashSet<>();

        for (int i=0; i<chr.length;i++) {
            char c = chr[i];
            if (!stringSet1.add(c)) {
                //System.out.println(c);
                stringSet2.add(c);
            }
        }
        System.out.println(stringSet2);
    }
}
