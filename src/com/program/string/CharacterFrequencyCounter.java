package com.program.string;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCounter {

    public static void main(String[] args) {
        String input = "aabbccddeea";

        Map<Character,Integer> mapChar = new HashMap<>();

        for (char ch : input.toCharArray()) {
            mapChar.put(ch, mapChar.getOrDefault(ch, 0)+1);
        }

        for (Map.Entry<Character,Integer> mapEnt : mapChar.entrySet()) {
            System.out.print(mapEnt.getKey().toString()+mapEnt.getValue().toString());
        }
    }
}
