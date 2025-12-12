package com.program.string;

import java.util.ArrayList;
import java.util.List;

public class CountVowelsAndConsonantsInStringSecoundWay {

    public static void main(String[] args) {

        String str = "apple is fruit.1233";

        str = str.toLowerCase();

       int vowel = 0;
       int cons = 0;

        List<Character> listVowel = new ArrayList<>();
        List<Character> listCons = new ArrayList<>();

       for (char ch : str.toCharArray()) {
               if (Character.isLetter(ch)) {
                   if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                       vowel++;
                       listVowel.add(ch);
                   } else {
                       cons++;
                       listCons.add(ch);
                   }
               }
           }
        System.out.println("Vowel count"+vowel);
        System.out.println("Cons count"+cons);
        System.out.println("Vowel "+listVowel);
        System.out.println("Cons"+listCons);
       }
    }
