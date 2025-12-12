package com.program.string;

public class MovingLeadingZerosToTheEnd {

    public static void main(String[] args) {

        String input = "32400121200";

        StringBuilder nonZeroDigits = new StringBuilder();
        StringBuilder zeroDigit = new StringBuilder();

        int count =0;

        for (char chr : input.toCharArray()) {
            if (chr == '0') {
                zeroDigit.append(chr);
                count++;
            } else {
                nonZeroDigits.append(chr);
            }
        }
        System.out.println(nonZeroDigits.toString() + zeroDigit.toString());
        System.out.println(count);
    }
}
