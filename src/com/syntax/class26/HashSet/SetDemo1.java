package com.syntax.class26.HashSet;

import java.util.HashSet;

public class SetDemo1 {
        public static void main(String[] args) {

            HashSet<String> hashSet=new HashSet<>();
            hashSet.add("Apple");
            hashSet.add("Mango");
            hashSet.add("Kiwi");
            hashSet.add("Apple");
            hashSet.add("Apple");
            System.out.println(hashSet);
        }
    }


