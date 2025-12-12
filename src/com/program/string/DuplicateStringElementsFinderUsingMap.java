package com.program.string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateStringElementsFinderUsingMap {

    public static void main(String[] args) {
        String word = "hello";

        Map<Character,Integer> map= new HashMap<>();

        for (char chh : word.toCharArray()) {
            map.put(chh, map.getOrDefault(chh,0)+1);
        }

        for (Map.Entry<Character,Integer> mapEntry : map.entrySet()) {
            if (mapEntry.getValue()>1) {
                System.out.println(" "+mapEntry.getKey()+ ": "+mapEntry.getValue());
            }
        }
    }
}
