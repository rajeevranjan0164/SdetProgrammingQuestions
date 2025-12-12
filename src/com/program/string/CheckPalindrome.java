package com.program.string;

public class CheckPalindrome {

    /*
    Palindrome Check Using Two-Pointer Technique

    Initialize Pointers:
    - left starts at the first character (index 0).
    - right starts at the last character (index str.length() - 1).

    Two-pointer Comparison:
    - Compare the characters at left and right indexes:
      - If they are not equal, return false immediately (not a palindrome).
    - Increment left and decrement right to move pointers inward.

    Loop Ends:
    - The loop ends when left is no longer less than right.
    - At this point, all characters have been matched, so return true (it's a palindrome).

    Working Example:
    Input: str1 = "radar"

    Step 1: Compare str.charAt(left) and str.charAt(right):
    - left = 0, right = 4 → 'r' == 'r' → True.
    - Move pointers: left = 1, right = 3.

    Step 2: Compare again:
    - left = 1, right = 3 → 'a' == 'a' → True.
    - Move pointers: left = 2, right = 2.

    Step 3: Middle Character:
    - When left == right, the loop ends, and all characters matched.
    - Return true.

    Output: "radar is a palindrome: true"
*/

    /*
    ✅ str = str.replaceAll("\\s", "").toLowerCase();
Removes all spaces from the string.

Converts the string to lowercase.

This helps in comparing "Madam" and "madam" as equal, ignoring case.

Example: "Madam" → "madam"

✅ int left = 0; and int right = str.length() - 1;
These are two pointers:

left starts from the beginning.

right starts from the end.

✅ while (left < right)
Keep comparing characters from both ends, moving toward the center.

✅ if (str.charAt(left) != str.charAt(right))
If characters don't match, it's not a palindrome → return false.

✅ left++; right--;
Move inward:

Increase left by 1

Decrease right by 1

✅ return true;
If the loop completes and no mismatches are found → it's a palindrome.


     */
    public static void main(String[] args) {

        String str1 = "radarr";

        int left = 0;
        int right = str1.length() - 1;

        boolean flag = true;
        while (left < right) {
            if (str1.charAt(left) != str1.charAt(right)) {
                System.out.println("this is not palindrome");
                flag = false;
                break;
            }
            left++;
            right--;
        }
        if (flag) {
            System.out.println(str1 + " is a Palindrome");
        } else {
            System.out.println(str1 + " is NOT a Palindrome");
        }

    }

    }

