package com.program.string;

public class ReverseString {

    public static void main(String[] args) {

        String input = "GeeksForGeeks";

        // convert String to character array
        // by using toCharArray

        char[] convertedChar = input.toCharArray();

        for (int i = convertedChar.length-1; i>=0; i--) {
            System.out.print(convertedChar[i]);
        }

    }
}
