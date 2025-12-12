package com.program.string;

public class PrintEachLetterTwiceTwoUsingStringBuilder {

    public static void main(String[] args) {
        String str = "hello";

        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : str.toCharArray()) {
            stringBuilder.append(ch).append(ch);
        }
        System.out.println(stringBuilder.toString());
    }
}
