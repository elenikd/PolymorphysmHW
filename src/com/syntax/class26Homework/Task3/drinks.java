package com.syntax.class26Homework.Task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class drinks {

    public static void main(String[] args) {

        //3) Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

     ArrayList<String>drink =new ArrayList<>();
     drink.add("Sex on a Beach");
     drink.add("Martini");
     drink.add("Sangria");
     drink.add("Vodka");
     drink.add("Tequila");
        System.out.println(drink);

        Iterator<String>iterator=drink.iterator();
        while(iterator.hasNext()){
            String drink5 =iterator.next();
            if(drink5.contains("a") || drink5.contains("e")) {
            }
                System.out.println(drink5.replaceAll("water", "water"));
            }
        }

        }





