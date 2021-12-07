package com.syntax.Class25Homework;

import java.util.ArrayList;

public class Countrie {

    /*
    Create an ArrayList that will store 5 names into it.
    Find out whether the given ArrayList is empty or not?
    Check whether the specific name is present in an ArrayList or not?
    Find the size of your arrayList and print all values from that
     */

    //ArrayList <> called genirics - Diamond Operator

    public static void main(String[] args) {

        ArrayList<String> countrie=new ArrayList<>();

      countrie.add("Brazil");
      countrie.add("Italia");
      countrie.add("Spain");
      countrie.add("Russia");
      countrie.add("America");
      System.out.println(countrie);
      System.out.println(countrie.isEmpty());
      System.out.println(countrie.contains("Spain"));
      System.out.println(countrie.size());

    }

    }





