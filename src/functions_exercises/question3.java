package functions_exercises;

import java.util.Scanner;

public class question3 {
//    voting eligibility
    public static String isEligibleForVoting(int age){
        if(age<0)
            return "age must be greater than 0, invalid input";
        else if(age<=18)
            return "not eligible for voting";
        else
            return "eligible for voting";
    }
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int age=scn.nextInt();
    System.out.println(isEligibleForVoting(age));
}
}
