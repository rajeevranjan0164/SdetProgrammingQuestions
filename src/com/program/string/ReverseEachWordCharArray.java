package com.program.string;

public class ReverseEachWordCharArray {

    public static void main(String[] args) {

        // 1. Declare the input string to be processed
        String str = "programming raj";

        // 2. Split the sentence into individual words based on spaces
        String[] splitString = str.split(" ");


        // 3. Initialize an empty string to store the final result
        String result = "";

        // 4. Outer loop: Iterate through each word in the array
        for (String chr : splitString) {
            
            // 5. Convert the current word into an array of individual characters
            char[] charArray = chr.toCharArray();
            
            // 6. Inner loop: Iterate through the character array backwards
            for (int i = charArray.length-1; i>=0;i--) {
                
                // 7. Append each character to our result string in reverse order
                result += charArray[i];
            }
            
            // 8. Add a space after each reversed word is finished
            result += " ";
        }
        
        // 9. Print the final result, removing the trailing space at the very end
        System.out.println(result.trim());
    }
}
