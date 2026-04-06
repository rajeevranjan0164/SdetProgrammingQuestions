package com.program.string;

import java.util.ArrayList;
import java.util.List;

/**
 * This program separates elements from an array into two lists based on 
 * whether their index is even or odd.
 * 
 * --- DRY RUN (Example: {"Java", "Selenium", "TestNG"}) ---
 * elements.length = 3
 * 
 * 1. i = 0: (0 % 2 == 0) is TRUE. evenList.add("Java") -> evenList: ["Java"]
 * 2. i = 1: (1 % 2 == 0) is FALSE. oddList.add("Selenium") -> oddList: ["Selenium"]
 * 3. i = 2: (2 % 2 == 0) is TRUE. evenList.add("TestNG") -> evenList: ["Java", "TestNG"]
 * 
 * Final Output:
 * Even : [Java, TestNG]
 * Odd : [Selenium]
 */
public class EvenOddIndexElement {

    public static void main(String[] args) {
        
        // 1. Declare an array of string elements
        String[] elements = {"Java", "Selenium", "TestNG", "Maven", "Jenkins", "Docker"};

        // 2. Initialize a list to store elements at even indices (0, 2, 4...)
        List<String> evenList = new ArrayList<>();
        
        // 3. Initialize a list to store elements at odd indices (1, 3, 5...)
        List<String> oddList = new ArrayList<>();
        
        // 4. Start a loop that iterates through every index of the array
        for (int i = 0; i < elements.length; i++) {
            
            // 5. Check if the current index 'i' is an even number (0, 2, 4, etc.)
            if (i % 2 == 0) {
                // 6. If index is even, add the element to the evenList
               evenList.add(elements[i]);
            } else {
                // 7. If index is odd, add the element to the oddList
                oddList.add(elements[i]);
            }
        }
        
        // 8. Print the list of elements found at even indices
        System.out.println("Even : " + evenList);
        
        // 9. Print the list of elements found at odd indices
        System.out.println("Odd : " + oddList);
    }
}
