package com.program.string;

public class CountTheNumberWordsString {

    public static void main(String[] args) {

        String str = "Test Automation Java Automation"; // Input string

        String[] strArray = str.trim().split("\\s+");

        int len = strArray.length;
        System.out.println(len);
    }
}
