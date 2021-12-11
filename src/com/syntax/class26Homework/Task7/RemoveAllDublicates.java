package com.syntax.class26Homework.Task7;                    // Task1                //removing duplicates

import java.util.*;

public class RemoveAllDublicates {

   public static void main(String[] args) {


      /* 7) How can you remove all duplicates from ArrayList?
List<String> aList= new ArrayList<>();
aList.add("John");
aList.add("Jane");
aList.add("James");
aList.add("Jasmine");
aList.add("Jane");
aList.add("James");
     */

      List<String> alist = new ArrayList<>();
      alist.add("John");
      alist.add("Jane");
      alist.add("James");
      alist.add("Jasmine");
      alist.add("Jane");
      alist.add("james");
      System.out.println(alist);

      HashSet<String> set = new HashSet<>(alist);
      set.addAll(alist);
      System.out.println(set);

   }
    }
//aList.retainAll(alist);
//System.out.print(alist);
 //HashSet <String> set=new HashSet<>(aList);
 //set.addAll(aList);
 //System.out.println(set);

   //  retainAll - remove dublicate
    // retain - keep same



