package com.program.array;

/**
 * PROGRAM: SUM ONLY INTEGERS FROM A STRING ARRAY
 * (Ignores letters, symbols, or anything that isn't a valid number)
 * 
 * --- DRY RUN (Example: {"5", "a", "2"}) ---
 * Input Array: {"5", "a", "2"}
 * sum = 0
 * 
 * Iteration 0: str = "5"
 * - Try: Integer.parseInt("5") -> Success!
 * - Action: sum = 0 + 5 = 5
 * 
 * Iteration 1: str = "a"
 * - Try: Integer.parseInt("a") -> Error! (NumberFormatException)
 * - Action: Jump to 'catch' block. Ignore "a". Continue loop.
 * 
 * Iteration 2: str = "2"
 * - Try: Integer.parseInt("2") -> Success!
 * - Action: sum = 5 + 2 = 7
 * 
 * Final Output: 7
 */
public class SumOnlyIntegers {

    public static void main(String[] args) {

        // 1. Initialize a String array with a mix of numbers, letters, and symbols
        String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};

        // 2. Initialize a variable 'sum' to zero to store the total
        int sum = 0;

        // 3. Start a 'for-each' loop to iterate through every 'str' in the array
        for (String str : array) {
            
            // 4. Use a 'try' block to attempt converting the string to a number
            try {
                
                // 5. Integer.parseInt(str) converts the string (like "5") to an actual integer (5)
                // 6. Add that integer value to our running 'sum'
                sum += Integer.parseInt(str);
                
            } 
            // 7. If Integer.parseInt fails (e.g., if str is "a" or "#"), it throws an error
            catch (NumberFormatException e) {
                
                // 8. The 'catch' block catches that error, so the program doesn't crash
                // 9. We do nothing here, which effectively "ignores" the non-numeric string
                
            } // 10. End of try-catch block
            
        } // 11. End of the loop after checking all elements

        // 12. Print the final calculated sum of only the valid integers found
        System.out.println("Sum of integers: " + sum);
        
    } // 13. Closing brace for the main method
} // 14. Closing brace for the class
