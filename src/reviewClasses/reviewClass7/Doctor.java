package reviewClasses.reviewClass7;       // package com.syntax.review2;   Teacher Asel

public class Doctor {                    // 4 Doctor

    String name;
    String lastname;
    String speciality;            //  instance variables
    double salary;

    static String hospital;

    Doctor (String name,String lastName,String speciality, double salary);
        name=name;
    lastName=lastName;
    salary=salary;

    //void is a method
    void printInfo() {
        System.out.println(name + " "+ lastname + "is a " +speciality);
    }
    void work() {
        System.out.println(name + " works at hospital " + hospital);
    }
    void getPaid(){
        System.out.println(name+" gets paid " + salary);

    }
}
