package com.program.string;

public class StringLenthwithoutMethodUsingToCharArray {

    public static void main(String[] args) {
        String str = "Automation";

        int count =0;

        for (char ch : str.toCharArray()) {
            count++;
        }
        System.out.println(count);
    }
}
