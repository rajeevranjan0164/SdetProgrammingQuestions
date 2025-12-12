package com.program.string;

public class SeparateLettersAndDigits {

    public static void main(String[] args) {

        String str = "Subbu123raj";

        // StringBuilder to store letters and digits separately
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for (char chr : str.toCharArray()) {
            if (Character.isLetter(chr)) {
                letters.append(chr);
            } else if (Character.isDigit(chr)) {
                digits.append(chr);
            }
        }
        System.out.println(letters);
        System.out.println(digits);
    }
}
