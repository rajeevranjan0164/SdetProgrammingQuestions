package com.java.pra;

import java.math.BigInteger;

public class FindNumberDigitsGivenNumber {

    public static void main(String[] args) {

        long number = 12345678910L;

        BigInteger bigInteger = new BigInteger("12345678910");

        int len = bigInteger.toString().length();

        System.out.println(len);
    }
}
