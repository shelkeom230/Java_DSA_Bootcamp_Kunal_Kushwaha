package functions_exercises;

import java.util.Scanner;

public class question1 {
//    seprate functions
    static void findMaxMinBrute(int a,int b,int c){
//        using nested structures
            int greater=-1;
            if(a>b && a>c)
                greater=a;
            else if(b>c && b>a)
                greater=b;
            else
                greater=c;

            int smaller=-1;
            if(a<b && a<c)
                smaller=a;
            else if(b<a && b<c)
                smaller=b;
            else
                smaller=c;

        System.out.println("greater: "+greater+" smaller: "+smaller);
    }
    public static void findMaxMin(int a,int b,int c){
        int temp=a>b?a:b;
        int maxele=temp>c?temp:c;

        int temp2=a<b?a:b;
        int minele=temp2<c?temp2:c;
        System.out.println("maxele: "+maxele+" minele: "+minele);
    }
//find max and min from the 3 numbers using function

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a,b,c;
        a=scn.nextInt();
        b= scn.nextInt();
        c= scn.nextInt();

        findMaxMinBrute(a,b,c);

    }
}
