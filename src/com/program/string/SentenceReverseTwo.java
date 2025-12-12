package com.program.string;

public class SentenceReverseTwo {

    public static void main(String[] args) {
        String str = "India is great democreative country and capital delhi";

        String b = "rajeev123";

        //"India", "is", ""
        String[] strArray = str.split(" ");

        StringBuilder stringBuilder = new StringBuilder();


        for (int i = strArray.length-1; i>=0; i--) {
            stringBuilder.append(strArray[i]).append(" ");
        }
        System.out.println(stringBuilder);
    }
}
