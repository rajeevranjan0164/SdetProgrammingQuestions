package com.program.array;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInTwoArray {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};





        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();

        for (int num : array1) {
            set.add(num);
        }

        for (int num2 : array2) {
            if (set.contains(num2)) {
                set1.add(num2);
            }
        }
        System.out.println(set1);
    }
}
