package com.davefcodes.introduction;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students:{roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];


//        Student[] student1 = new Student(10,"David", 89.5);
//        student1.rno(10);

//        Student[] students = new Student(10, "David", 56.7);
        Student[] students = new Student[5];

        // just declaring
        Student david = new Student(30, "Wonder", 90.9f, "M");

//        david.rno = 10;
//        david.name = "Wonder Faibil";
//        david.marks = 87.6f;

//        System.out.println(david.rno);
//        System.out.println(david.name);
//        System.out.println(david.marks);

        david.changeName("Faibil");
        david.greeting();

        Student random = new Student(david);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);
        System.out.println(random2.gender);



    }
}

// create class
// for every single student
class Student{
    // Instance variables
    int rno;
    String name;
    float marks;
    String gender;

// Use constructors to set object properties.
// Within the constructors, the 'this' keyword refers to the current instance of the object.


    // Default constructor: Initializes a student with default values
    // Calls another constructor to handle the initialization.
    Student(){
        // internally: new Student (10, "default person", 100.0f);
        this(10, "default person", 100.0f, "Male/Female");
    }




    // Parameterized constructor: Allows the creation of a student with specified values.
    // For example: Student student1 = new Student(15, "becky", 92.5f);
    Student (int roll, String name, float marks, String gender){
       this.rno = roll;
       this.name = name;
       this.marks = marks;
       this.gender = gender;
       System.out.println("Student object is created!");
    }

    // Copy constructor: Creates a new student object using the properties of an existing student object.
    // For example: Student random = new Student(existingStudent);
    Student (Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    void greeting(){
        System.out.println("Hello " + this.name);
    }

    void student_rno(){
        System.out.println("Student roll number is " + this.rno);
    }

    void changeName(String newName){
        this.name = newName;
    }
}
