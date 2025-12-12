package com.program.array;

import java.util.ArrayList;
import java.util.List;

public class FirstLastElementInArray {

    public static void main(String[] args) {
        // Creating an ArrayList
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int first = numbers.get(0);
        int last = numbers.get(numbers.size()-1);

        System.out.println(first);
        System.out.println(last);

    }
}
