package com.program.string;

public class StringLenthwithoutMethodUsingCharAtTryCatch {

    public static void main(String[] args) {
        String str = "Automation";

        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (Exception s) {

        }

        System.out.println(length);
    }

}
