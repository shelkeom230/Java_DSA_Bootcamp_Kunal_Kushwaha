package arrays_arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArrays {
    public static void main(String[] args) {
        int arr2d[][]={
                {1,2},
                {3,4,5},
                {6,7,8,9}
        };
        int arr[][]=new int[3][2];
        Scanner in=new Scanner(System.in);


        // taking input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=in.nextInt();
            }
        }

//        printing the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
            }
//            System.out.println("");
        }

//        another good way to print with one loop
        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
//        print using for each loop --> every row is itself an array
        for(int ele[]:arr){
//            System.out.println(Arrays.toString(ele));
        }
    }


}
