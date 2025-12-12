package com.program.string;

public class SentenceReverse {

    public static void main(String[] args) {
        String str = "India is great democreative country and capital delhi";


        // Split the string into words
        String[] stringArray = str.split(" ");
        //System.out.println(store);

        String storeTwo = "";
        for(int i=stringArray.length-1; i>=0;i--) {
            storeTwo += stringArray[i].concat(" ");
            //storeTwo += stringArray[i] + " "; //other way to solve this
        }

        System.out.println(storeTwo);
        String[] storeThree = storeTwo.split(" ");



        String fromLastEmpty = "";
        for (String ss : storeThree) {
            char[] chr = ss.toCharArray();
            for (int i=chr.length-1;i>=0;i--) {
                fromLastEmpty = fromLastEmpty + chr[i];
            }
            fromLastEmpty += " ";
        }

        System.out.println(fromLastEmpty);




    }
}
