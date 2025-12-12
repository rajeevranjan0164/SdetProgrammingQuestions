package com.program.string;

public class ReverseEachWordCharArray {

    public static void main(String[] args) {

        String str = "programming";

        String[] splitString = str.split(" ");


        String result = "";
        for (String chr : splitString) {
            char[] charArray = chr.toCharArray();
            for (int i = charArray.length-1; i>=0;i--) {
                result += charArray[i];
            }
            result += " ";
        }
        System.out.println(result.trim());
    }
}
