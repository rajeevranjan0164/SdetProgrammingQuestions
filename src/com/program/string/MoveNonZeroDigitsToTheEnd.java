package com.program.string;

public class MoveNonZeroDigitsToTheEnd {

    public static void main(String[] args) {

        String input = "32400121200";

        StringBuilder nonZero = new StringBuilder();
        StringBuilder zero = new StringBuilder();

        for (char chr : input.toCharArray()) {
            if (chr == '0') {
                zero.append(chr);
            } else {
                nonZero.append(chr);
            }
        }
        System.out.println(zero.toString()+nonZero.toString());
    }
}
