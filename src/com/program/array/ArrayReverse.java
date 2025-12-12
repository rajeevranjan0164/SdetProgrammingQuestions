package com.program.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayReverse {

    public static void main(String[] args) {

        int[] numArray = {1,2,3,4,5};

        List<Integer> list = new ArrayList<>();
        for (int i=numArray.length-1;i>=0;i--) {
            list.add(numArray[i]);
        }
        System.out.println(list);

    }
}
