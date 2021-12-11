package com.syntax.class26Homework.Task10;

    /* 10) Create a Set collection that will hold Objects of Student Type.
    In this set we do not care about the insertion order.
    Each student object should have name and studentID.
    Display name of each student.
     */

import java.util.HashSet;

public class Student {
    String name;
    String id;

    Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public void printStudent() {
        System.out.println(name + "   " + id);
    }

    public static void main(String[] args) {

        HashSet<Student>student=new HashSet<>();
        student.add(new Student("Jason","3456"));
        student.add(new Student("Patritia","5789"));
        student.add(new Student("Maria ", "6784"));
        student.add(new Student("Petter" , "16845"));

        for(Student stu:student){
            stu.printStudent();

        }
    }
}









