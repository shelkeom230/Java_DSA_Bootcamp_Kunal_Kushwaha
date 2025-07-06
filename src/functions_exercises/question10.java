package functions_exercises;

import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        System.out.println(isPalindrome(n));

    }
//    palindrome number
    public static boolean isPalindrome(int n){
        int revNum=0;
        int dup=n;
        while (n>0){
            int digit=n%10;
            revNum=(revNum*10)+digit;
            n/=10;
        }
        if(revNum==dup)
            return true;
        else
            return false;
    }
}
