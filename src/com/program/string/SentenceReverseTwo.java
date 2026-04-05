package com.program.string;

public class SentenceReverseTwo {

    public static void main(String[] args) {
        String str = "India is great democreative country and capital delhi";

        String b = "rajeev123";

        //"India", "is", ""
        //- This is the most important part. The split(" ") method looks for every space in the sentence and breaks the string into an array of individual words.
                //- ["India", "is", "great", "democreative", "country", "and", "capital", "delhi"]
        String[] strArray = str.split(" ");

        StringBuilder stringBuilder = new StringBuilder();

        //- The loop starts at the very last index of the array (strArray.length - 1).
                //- It goes backwards towards index 0.
                //- In each step, it takes the word at that index, adds it to the StringBuilder, and adds a space after it.
        for (int i = strArray.length-1; i>=0; i--) {
            stringBuilder.append(strArray[i]).append(" ");
        }
        System.out.println(stringBuilder);
    }
}
