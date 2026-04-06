package com.program.string;

/*Dry Run (Input: "Hello"):
        1. Array: ['H', 'e', 'l', 'l', 'o'] (Indices: 0, 1, 2, 3, 4)
        2. i = 4: Prints 'o'
        3. i = 3: Prints 'l'
        4. i = 2: Prints 'l'
        5. i = 1: Prints 'e'
        6. i = 0: Prints 'H'
        7. i = -1: Stop. Final Output: "olleH"*/

public class ReverseString {

    public static void main(String[] args) {

        String input = "GeeksForGeeks";

        // convert String to character array
        // by using toCharArray

        char[] convertedChar = input.toCharArray();

        // Start loop from the last index and go to the first index (0)
        for (int i = convertedChar.length-1; i>=0; i--) {
            System.out.print(convertedChar[i]);
        }
    }
}
