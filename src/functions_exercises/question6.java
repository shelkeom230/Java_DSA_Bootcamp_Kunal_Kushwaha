package functions_exercises;

import java.util.Scanner;

public class question6 {
//    circum and area of circle for given r
public static void findCircumAndArea(float r){
    double area=Math.PI*r*r;
    double circum=2*Math.PI*r;

    System.out.println("area: "+area+" circumference: "+circum);
}
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    float radius=scn.nextFloat();
    findCircumAndArea(radius);
}
}
