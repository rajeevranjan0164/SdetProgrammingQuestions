package com.program.string;

public class RemoveSpacesGivenString {

    public static void main(String[] args) {

        String str = "Welcome to Java World";

       String removeSpace =  str.replaceAll("\\s", "");

        System.out.println("String without spaces: " + removeSpace);
    }
}
