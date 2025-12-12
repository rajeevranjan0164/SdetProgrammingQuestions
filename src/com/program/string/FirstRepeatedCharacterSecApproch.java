package com.program.string;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacterSecApproch {

    public static void main(String[] args) {

        String str = "programming";

        str = str.toLowerCase();

        Set<Character> characterSet = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!characterSet.add(ch))  {
                System.out.println(ch);
                break;
            }
        }

    }
}
