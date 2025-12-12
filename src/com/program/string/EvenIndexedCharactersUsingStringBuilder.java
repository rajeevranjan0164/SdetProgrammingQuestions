package com.program.string;

public class EvenIndexedCharactersUsingStringBuilder {

    public static void main(String[] args) {

        String str = "Automation";

        StringBuilder stringBuilder = new StringBuilder();
        //print odd for (int i=1;i<str.length();i+=2) {
        for (int i=0;i<str.length();i+=2) {
            stringBuilder.append(str.charAt(i));
        }

        System.out.println(stringBuilder);
    }
}
