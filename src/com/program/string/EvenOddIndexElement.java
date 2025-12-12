package com.program.string;

import java.util.ArrayList;
import java.util.List;

public class EvenOddIndexElement {

    public static void main(String[] args) {
        String[] elements = {"Java", "Selenium", "TestNG", "Maven", "Jenkins", "Docker"};

        List<String> evenList = new ArrayList<>();
        List<String> oddList = new ArrayList<>();
        for (int i=0;i<elements.length;i++) {
            if (i % 2 == 0) {
               evenList.add(elements[i]);
            } else {
                oddList.add(elements[i]);
            }
        }
        System.out.println("Even : "+evenList);
        System.out.println("Odd : "+oddList);

        /*
        int index = 0;
for (String element : elements) {
    if (index % 2 == 0) {
        System.out.println("Even index " + index + ": " + element);
    } else {
        System.out.println("Odd index " + index + ": " + element);
    }
    index++;
}
         */
    }
}
