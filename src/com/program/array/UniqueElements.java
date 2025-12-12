package com.program.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueElements {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int array1 : array) {
            countMap.put(array1, countMap.getOrDefault(array1,0)+1);
        }

        for (Map.Entry<Integer, Integer> mapEntry : countMap.entrySet()) {
            if (mapEntry.getValue() == 1) {
                System.out.println(mapEntry.getKey());
            }
        }
    }
}
