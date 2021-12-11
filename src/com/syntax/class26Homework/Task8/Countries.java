package com.syntax.class26Homework.Task8;

import java.util.*;

public class Countries {       //alphabetical order
    public static void main(String[] args) {



    /* 8) Create a Set collection in which you need to add names of the countries.
    In this set we want all objects to be sorted in alphabetical order.
    Using 2 different ways retrieve all elements from set.
     */

        List<String> country = new ArrayList<>();
        country.add("Russia");
        country.add("Spain");
        country.add("Brazil");
        country.add("Argentina");
        country.add("Cannada");
        country.add("Denmark");
        country.add("USA");
        System.out.println(country);

        TreeSet<String> coun = new TreeSet<>();
        coun.addAll(country);
        System.out.println(coun);

    }
}

