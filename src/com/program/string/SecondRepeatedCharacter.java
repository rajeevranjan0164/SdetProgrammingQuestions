package com.program.string;

import java.util.HashSet;
import java.util.Set;

public class SecondRepeatedCharacter {

    public static void main(String[] args) {
        String str = "programming";

        str = str.toLowerCase();

        int secoundCount = 0;

        Set<Character> characterSet = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!characterSet.add(ch)) {
                secoundCount++;
                if (secoundCount == 2) {
                    System.out.println(ch);
                }
            }
        }
    }
}
