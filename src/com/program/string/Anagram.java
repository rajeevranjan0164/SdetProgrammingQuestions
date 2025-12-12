package com.program.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

    /*
             Pseudocode:
             Input:
             - Read two strings, str1 and str2.

             Preprocess Strings:
             - Remove all spaces from str1 and str2.
             - Convert both strings to lowercase.

             Convert Strings to Character Arrays:
             - Convert str1 into a character array chr1.
             - Convert str2 into a character array char2.

             Sort Character Arrays:
             - Sort the character array chr1.
             - Sort the character array char2.

             Compare Sorted Arrays:
             - If chr1 and char2 are equal:
                 - Print "Given strings are anagrams".
             - Else:
                 - Print "Given strings are not anagrams".
         */

    /*
    1. Normalize the strings:
Remove all spaces.

Convert both strings to lowercase.

2. Check length:
If lengths differ → Not anagrams.

3. Sort and compare:
Sort both strings.

If sorted strings are equal → Anagrams.
     */

    /*
    ✅ Step 1: Convert to character arrays
str1 → ['l', 'i', 's', 't', 'e', 'n']
str2 → ['s', 'i', 'l', 'e', 'n', 't']
✅ Step 2: Sort both arrays
Sorted str1 → ['e', 'i', 'l', 'n', 's', 't']
Sorted str2 → ['e', 'i', 'l', 'n', 's', 't']
✅ Step 3: Compare sorted arrays
Are they equal? → Yes ✅
✅ Result:
"listen" and "silent" are anagrams.

     */


    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        String str3 = str1.replaceAll("\\s+", "").toLowerCase();
        String str4 = str2.replaceAll("\\s+", "").toLowerCase();


        char[] chr1 = str3.toCharArray();
        char[] char2 = str4.toCharArray();

        Arrays.sort(chr1);

        Arrays.sort(char2);

        Arrays.equals(chr1, char2);

        if (Arrays.equals(chr1, char2)) {
            System.out.println("Given String are Anagram");
        } else {
            System.out.println("Given String are not Anagram");
        }

    }
}
