package com.program.string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWords {

    public static void main(String[] args) {

        String sentence = "hello world world hello java java Rajeev";

       String[] words =  sentence.split(" ");

        Set<String> uniqueWords = new HashSet<>();

        StringBuilder stringBuilder = new StringBuilder();

        for (String str : words) {
            if (!uniqueWords.add(str)) {
                stringBuilder.append(str).append(" ");
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
