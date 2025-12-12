package com.java.pra;

public class SwapTwoNumbersWithoutUsingThirdVariable {

    public static void main(String[] args) {

        int a = 10, b = 20;

        a = a + b; // a = 30
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
