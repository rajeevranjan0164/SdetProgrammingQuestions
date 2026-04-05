package com.java.pra;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number ");
        int number = scanner.nextInt();*/

        int num = 1234;

        String str = Integer.toString(num);

        //String reverse  = new StringBuilder(String.valueOf(number)).reverse().toString();

        //char[] chr = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=str.length()-1; i>=0;i--) {
            //System.out.print(str.charAt(i));
            stringBuilder.append(str.charAt(i));
        }

        System.out.println(stringBuilder);


    }
}
