package com.syntax.class26Homework.Task1;        //Task 1

import java.util.ArrayList;

public class Car {
  public static void main(String[] args) {


    // 1) Create an arraylist of cars and retrieve all the values using 3 different ways.

    ArrayList<String> cars = new ArrayList<>();
    cars.add("Toyota");
    cars.add("Nissan");
    cars.add("Ford");
    System.out.println(cars);

    for (int i = 0; i < cars.size(); i++) {

      System.out.println(cars.get(i) + " ");
    }
    System.out.println();

    for (String car : cars) {
      System.out.print(car + " ");
    }
  }
  }




