package oop;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // give me roll no of 5 students
        int rno[]=new int[5];

        // give me names of 5 students
        String names[]=new String[5];

        // give me 5 students data
        Student students[]=new Student[5];

        // create a reference variable to Student class
        Student kunal;

//        allocate memory to object - dynamic memory allocation.
        kunal=new Student();

        // initialize with some values
        kunal.rno=13;
        kunal.name="kunal kushwaha";
//        kunal.marks=95.60f; by default 90 marks

        System.out.println(kunal); // by default some random value.

        System.out.println(kunal.rno); // by default value for integer is 0
        System.out.println(kunal.name); // String is an object, so it's default value is null
        System.out.println(kunal.marks); // by default value of float is 0.0

        // what is inside that students array
        System.out.println(Arrays.toString(students)); // all nulls
    }


}

// create a class Student
class Student{
    // properties
    int rno;
    String name; //String is an object in java.
    float marks=90;
}
