package com.program.string;

import java.util.HashMap;
import java.util.Map;

public class StringCompressionMap {

    public static void main(String[] args) {

        String str = "aabbcccdd";

        Map<Character, Integer> charCount = new HashMap<>();

        for (char chr : str.toCharArray()) {
            charCount.put(chr, charCount.getOrDefault(chr,0)+1);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry<Character, Integer> mapEntry : charCount.entrySet()) {
            stringBuilder.append(mapEntry.getKey()).append(mapEntry.getValue());
        }
        System.out.println(stringBuilder);


    }
}
