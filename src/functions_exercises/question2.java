package functions_exercises;

import java.util.Scanner;

public class question2 {
//    even or odd number
    static String findEvenOrOdd(int n){
        if(n<0)
            return "number should be greater than 0";
        else if(n%2==0)
            return "even";
        else
            return "odd";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(findEvenOrOdd(n));
    }
}
