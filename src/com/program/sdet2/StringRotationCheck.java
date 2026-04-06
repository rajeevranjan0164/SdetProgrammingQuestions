package com.program.sdet2;

/**
 * --- SDET 2 QUESTION: String Rotation Check ---
 * 
 * The Goal: Check if s2 is a rotation of s1 (e.g., "ABCD" and "CDAB").
 * 
 * --- THE SENIOR TRICK ($O(n)$ Solution) ---
 * If you concatenate a string with itself (s1 + s1), it contains every 
 * possible rotation of s1.
 * Example: s1 = "ABCD", s1 + s1 = "ABCDABCD"
 * All rotations ("BCDA", "CDAB", "DABC") are present inside "ABCDABCD"!
 */
public class StringRotationCheck {

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";

        boolean result = isRotation(s1, s2);
        System.out.println("Is '" + s2 + "' a rotation of '" + s1 + "'? " + result);
    }

    public static boolean isRotation(String s1, String s2) {
        // 1. Check for null and ensure lengths are equal
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }

        // 2. The simple concatenation trick
        String combined = s1 + s1;
        
        // 3. If s2 exists within the combined string, it must be a rotation
        return combined.contains(s2);
    }
}
