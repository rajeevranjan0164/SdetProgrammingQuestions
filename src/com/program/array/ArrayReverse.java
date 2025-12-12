package com.program.array;

import java.util.ArrayList;
import java.util.List;
public class ArrayReverse {

    public static void main(String[] args) {

        // Initialize an integer array with some values.
        int[] numArray = {1,2,3,4,5};

        // Create a new ArrayList to store the reversed elements.
        List<Integer> list = new ArrayList<>();
        
        // Loop through the original array in reverse order.
        for (int i=numArray.length-1;i>=0;i--) {
            // Add each element from the original array to the new list.
            list.add(numArray[i]);
        }
        
        // Print the list containing the reversed array.
        System.out.println(list);

    }
}
