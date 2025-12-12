package com.java.pra;

import java.util.ArrayList;
import java.util.Arrays;

public class SumdDigitsNnumber {

    public static void main(String[] args) {

        int num = 123456;
        String str = String.valueOf(num);

       int sum = 0;
        for (char chr : str.toCharArray()) {
                //sum += chr - '0';
                sum += Character.getNumericValue(chr);
        }
        System.out.println(sum);

    }
}
