package com.program.string;

public class findConsonantsSecoundApproch {

    public static void main(String[] args) {
        String str = "Hello World!";

        str = str.replaceAll("\\s","").toLowerCase();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                    System.out.print(ch);
                }
            }
        }

    }
}
