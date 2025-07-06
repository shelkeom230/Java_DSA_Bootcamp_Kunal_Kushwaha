package functions_exercises;

import java.util.Scanner;

public class question7 {
//    prime number 1
    public static boolean findPrime1(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                count+=1;
        }
        if(count==2)
            return true;
        else
            return false;
    }
    public static boolean findPrime2(int n){
        if(n<2)
            return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(findPrime2(n));
    }
}
