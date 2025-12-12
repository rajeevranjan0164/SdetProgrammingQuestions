package com.program.string;

import java.util.HashSet;
import java.util.Set;

public class SecondRepeatedCharacterTwo {

    public static void main(String[] args) {
        String str = "pr og ramming ";

        str.replaceAll("//s+","");
        System.out.println("remove space : "+str);
        Set<Character> characterSet = new HashSet<>();

        int count = 0;

        for (char chars : str.toCharArray()) {
            if (!characterSet.add(chars)) {
                count++;
                if (count == 2) {
                    System.out.println(chars);
                    break;
                }
            }
        }
    }

}
