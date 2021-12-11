package com.syntax.class26Homework.Task2;                 //Task 2

import java.util.ArrayList;
import java.util.Iterator;

public class words {
    public static void main(String[] args) {


        // 2) Create an arrayList of words. Remove every word that ends with “e”.


        ArrayList<String> words = new ArrayList<>();
        words.add("I hate");
        words.add("doing");
        words.add("my Homework");

        for(String word:words){
            if (word.endsWith("e")){
              words.remove(word);
              System.out.println(words);
        }
        }
}
}

