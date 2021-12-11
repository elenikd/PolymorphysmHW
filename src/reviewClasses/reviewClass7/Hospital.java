package reviewClasses.reviewClass7;               // package com.syntax.review2;   Teacher Asel

public class Hospital {                           // Example 4 //Doctor ==> Hospital

    public static void main(String[] args) {

        Doctor.hospital="Inova";
        // when you call it for constructor
        Doctor doctor1=new Doctor("John","Smith","Dentist",20000);
        // doctor1.name="John";
        //doctor1.lastName="Doe";               // we don't need this lines 8, 9, 10 when we create constructor
        //doctor1.speciality="Dentist";
        doctor1.printInfo();
        doctor1.work();

        Doctor doctor2=new Doctor("Jane", "Doe", "Cardiologist");
        //doctor2.name="Jane";
        //doctor2.lastName="Smith";
        //doctor2.speciality="Cardiologist";
        doctor2.work();
        doctor2.lastName="Bond";
        // change will affect all instances
        doctor2.hospital="JW Hospital";

        System.out.println();
        doctor2.work();
        doctor1.work();
        System.out.println(doctor1.lastName);
        System.out.println(doctor2.lastName);

        // accessing static method
        Doctor.companyName();

        doctor1.treatPatients("James");
        doctor2.treatPatients("Anna");


    }
}
