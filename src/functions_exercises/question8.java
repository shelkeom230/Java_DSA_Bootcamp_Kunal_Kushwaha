package functions_exercises;

import java.util.Scanner;

/*

Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
 */
public class question8 {
//    give grade to students
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("enter your marks out of 100: ");
    int marks=scn.nextInt();
    giveGrades(marks);

}
public static void giveGrades(int marks){
    if(marks<0)
        System.out.println("invalid marks");
    if(marks<=40)
        System.out.println("Fail");
    else if(marks>=41 && marks<=50)
        System.out.println("DD");
    else if(marks>=51 && marks<=60)
        System.out.println("CD");
    else if(marks>=61 && marks<=70)
        System.out.println("BC");
    else if(marks>=71 && marks<=80)
        System.out.println("BB");
    else if(marks>=81 && marks<=90)
        System.out.printf("AB");
    else
        System.out.println("AA");
}
}
