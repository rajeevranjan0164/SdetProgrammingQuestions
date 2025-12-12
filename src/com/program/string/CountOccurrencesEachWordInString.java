package com.program.string;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesEachWordInString {

    /*
    ✅ Step 1: Split the sentence into words
    String[] strArray = str.split(" ");
    - This breaks the sentence wherever there's a space.
    - Creates an array like:
      ["Test", "Automation", "Java", "Automation"]

    ✅ Step 2: Create a HashMap
    Map<String, Integer> map = new HashMap<>();
    - This will store:
      Key   → each word
      Value → how many times that word appears

    ✅ Step 3: Loop through the words
    for (String chr : strArray) {
        map.put(chr, map.getOrDefault(chr, 0) + 1);
    }

    🔁 What happens in each loop:
    - map.getOrDefault(chr, 0):
        → If the word (chr) is already in the map, get its current count.
        → If it's not there, assume the count is 0.

    - +1:
        → Increases the count by 1.

    - map.put(chr, count):
        → Updates the map with the new count.

    🧠 Final Map Result:
    {
      "Test" = 1,
      "Automation" = 2,
      "Java" = 1
    }
*/


    public static void main(String[] args) {

        String str = "Test Automation Java Automation"; // Input string

        /*
         * Step 1: Split the sentence into words
         * String[] strArray = str.split(" ");
         * - This breaks the sentence wherever there's a space.
         * - Creates an array like:
         *   ["Test", "Automation", "Java", "Automation"]
         */

        String[] strArray = str.split(" ");

        /*
         * Step 2: Create a HashMap
         * Map<String, Integer> map = new HashMap<>();
         * - This will store:
         *   Key   → each word
         *   Value → how many times that word appears*/

        Map<String, Integer> map = new HashMap<>();


        for (String chr : strArray) {
            map.put(chr, map.getOrDefault(chr, 0)+1);
        }
        /*
         * Step 3: Loop through the words
         * for (String chr : strArray) {
         *     map.put(chr, map.getOrDefault(chr, 0) + 1);
         * }
         *
         * 🔁 What happens in each loop:
         * - map.getOrDefault(chr, 0):
         *     → If the word (chr) is already in the map, get its current count.
         *     → If it's not there, assume the count is 0.
         *
         * - +1:
         *     → Increases the count by 1.
         * - map.put(chr, count):
         *     → Updates the map with the new count.*/
        System.out.println("Count of Words in a given string: " + map);

        // Example of how to iterate and print each word and its count
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Word: '" + entry.getKey() + "' -> Count: " + entry.getValue());
        }
    }
}
