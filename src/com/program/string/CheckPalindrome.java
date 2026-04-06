package com.program.string;

/**
 * --- DRY RUN (Example: "level") ---
 * 1. str1 = "level", left = 0, right = 4
 * 2. Loop 1: charAt(0) 'l' == charAt(4) 'l'. Match! left=1, right=3
 * 3. Loop 2: charAt(1) 'e' == charAt(3) 'e'. Match! left=2, right=2
 * 4. Loop ends (left is no longer < right). 
 * 5. flag remains true.
 * Final Result: "level is a Palindrome"
 */
public class CheckPalindrome {

    public static void main(String[] args) {

        // 1. Declare the input string to check
        String str1 = "radar";

        // 2. Initialize the left pointer at the start of the string (index 0)
        int left = 0;
        
        // 3. Initialize the right pointer at the end of the string (last index)
        int right = str1.length() - 1;

        // 4. Use a boolean flag to track if the string is a palindrome
        boolean flag = true;
        
        // 5. Use the two-pointer technique to move towards the center
        while (left < right) {
            
            // 6. Compare characters at the current left and right positions
            if (str1.charAt(left) != str1.charAt(right)) {
                
                // 7. If they don't match, it's not a palindrome
                flag = false;
                break; // Exit the loop immediately
            }
            
            // 8. Move the left pointer forward
            left++;
            
            // 9. Move the right pointer backward
            right--;
        }
        
        // 10. Check the flag to print the final result
        if (flag) {
            System.out.println(str1 + " is a Palindrome");
        } else {
            System.out.println(str1 + " is NOT a Palindrome");
        }
    }
}
