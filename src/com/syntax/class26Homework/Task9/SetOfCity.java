package com.syntax.class26Homework.Task9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class SetOfCity {
    public static void main(String[] args) {


    /* 9) Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”;
     */

        ArrayList<String> cities = new ArrayList<String>();
        cities.add("New York City");
        cities.add("Yonkers");
        cities.add("Rochester");
        cities.add("Albany");
        cities.add("Buffalo");
        System.out.print(cities);

        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.startsWith("A")) {
                iterator.remove();
            }
        }
        System.out.println(cities);
    }
}