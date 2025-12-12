package com.program.string;

public class SimplePermutations {

    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }

    public static void findPermutations(String str, String result) {

        if (str.isEmpty()) {
            System.out.println(result); // Print the final permutation
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String remaining = str.substring(0,i)+ str.substring(i+1);

            findPermutations(remaining, result+ch);
        }
    }
}
