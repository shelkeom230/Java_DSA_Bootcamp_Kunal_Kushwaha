package functions_exercises;

import java.util.Scanner;

public class question4 {
//    develop a basic caluclator using switch and calculator
    public static void calculator(int a,int b,int oper){
        switch (oper){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println((int)a/b);
                break;
            case 5:
                System.out.println(a%b);
                break;
            default:
                System.out.println("invalid option");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        calculator(a,b,2);
    }
}
