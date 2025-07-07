package oop;

public class Main2 {
    public static void main(String[] args) {

        // create a student named kunal
        Student2 kunal=new Student2(); // here these Student2 is a constructor.
        // System.out.println(kunal.rno);
        // System.out.println(kunal.name);
        // System.out.println(kunal.marks);

        // a new student rahul
        Student2 rahul=new Student2();
        // System.out.println(rahul.rno+" "+rahul.name+" "+rahul.marks);

        // calling greet method
        kunal.greet();
//        rahul.greet();

        kunal.changeName("kunal kushwaha");
        // kunal.greet();

        // create a new Student devesh
        Student2 devesh=new Student2(51,"devesh patil",92);
//        System.out.println(devesh.rno);
//        System.out.println(devesh.name);
//        System.out.println(devesh.marks);

        devesh.changeName("devil patil");
//        System.out.println(devesh.name);

        Student2 random=new Student2(devesh);
        // set random properties similar to devesh
//        System.out.println("name of random is "+random.name+" now");

        // this will call the default constructor
        Student2 random2=new Student2();
//        System.out.println(random2.name);

        Student2 one=new Student2(420,"fraud call",80);
        Student2 two=one;

        one.name="fraud call";

        System.out.println(two.name);

    }
}

// create a class
class Student2{
    // properties
    int rno;
    String name;
    float marks;

    // here we are doing constructor overloading, a part of compile time polymorphism
    // a constructor which copies other objects value passed as argument
    Student2(Student2 other){
        this.rno=other.rno;
        this.name=other.name;
        this.marks=other.marks;
    }
    // default constructor -- it does not take any arguments
    Student2(){
        // call another constructor from this default constructor
        // internally: new Student2(40,"default person",100.0f)
        this (40,"default person",100.0f);
    }

    // parametarised constructor
    // Student arpit=new Student(17,"arpit",89);
    // here this will be replaced with arpit and you will set arpit.rno,arpit.name & arpit.marks
    Student2(int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }


    // function to greet the student
    void greet() {
        System.out.println("Hi, "+this.name);
    }

    // a setter function to change student name
    void changeName(String newName){
        name=newName;
    }
}
