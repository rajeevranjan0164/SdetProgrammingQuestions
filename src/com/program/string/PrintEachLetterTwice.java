package com.program.string;

public class PrintEachLetterTwice {

    public static void main(String[] args) {

        String str = "hello";

        for (char ch : str.toCharArray()) {
            System.out.print(ch + "" + ch); // Print each character twice
        }
    }
}
