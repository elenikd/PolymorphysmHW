package reviewClasses.reviewClass7;       // package com.syntax.review2;   Teacher Asel

public class Doctor {                       // Example 4 //Doctor ==> Hospital

    // instance variables
    String name;
    String lastName;
    String speciality;
    double salary;

    // static variable
    static String hospital;

    // constructor is initializes your object  /  no return type /with a help of constructor we can initialize the variables.
    // if you don't create constructor the compiler creates for you
    //constructor
    Doctor(String name, String lastName, String speciality, double salary) {
        this.name = name;         //local variable inside the method, blocks and constructor
        this.lastName = lastName;                 // it will give you null output without the this.
        this.speciality = speciality;            // local variable and instance variable are the same you add this.
        this.salary = salary;
        System.out.println(name + " " + lastName + "" + speciality);

    } //constructor

    Doctor(String name, String lastName, String speciality) {
        this.name = name;
        this.lastName = lastName;
        this.speciality = speciality;
    }

    void treatPatients(String name) {
        this.name = name;
        System.out.println("Doctor" + this.name + "treats patients" + name);
    }                                // local variable have the same name as the instance variable
    // it always referees to your current object
    // void method doen't return anything

    void printInfo() {
        System.out.println(name + " " + lastName + " is a " + speciality);
    }

    // instance methods can work with instance and static
    void work() {
        System.out.println(name + " works at hospital " + hospital);
    }

    void getPaid() {
        System.out.println(name + " gets paid " + salary);
    }

    // static can work only with static
    static void companyName() {
        System.out.println("All doctors work at " + hospital);


        }

    }