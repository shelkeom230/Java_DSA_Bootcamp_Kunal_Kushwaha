package functions_exercises;

import java.util.Scanner;

public class question9 {
//    print factorial recursive
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        System.out.println(factIterative(n));
    }

//    print factorial iterative
    public static int factIterative(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static int factRecursive(int n){
        if(n==0) return 1;
        return n*factRecursive(n-1);
    }
}
