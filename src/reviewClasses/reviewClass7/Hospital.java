package reviewClasses.reviewClass7;        // package com.syntax.review2;   Teacher Asel

public class Hospital {                    // 5 Hospital


    public static void main(String[] args) {

        Doctor doctor1 = new Doctor();
        doctor1.name="Jhon";
        doctor1.lastname="Doe";
        doctor1.speciality="Dentist";

        Doctor.hospital="Inova";
        doctor1.work();

        Doctor.doctor2=new Doctor();
        doctor2.name="Jane";
        doctor2.lasName="Smith";
        doctor2.speciality="Cardiology";
        doctor2.spciality="Cardiologyst";
        doctor2.work();
        doctor2.lastname="Bond";
        doctor2.hospital="JW Hospital";
                                 // change will affect all instances
        System.out.println();
        doctor2.work();
        doctor1.work();
        System.out.println(doctor1.lastName);
        System.out.println(doctor2.lastName);


    }
}
