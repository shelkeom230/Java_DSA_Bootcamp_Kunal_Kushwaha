package arrays_arraylist;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//        array of primitives
        int arr[]=new int[5];
        // manual array assignment
        arr[0]=543;
        arr[1]=43;
        arr[2]=4;
        arr[3]=54;
        arr[4]=2;

        System.out.println(arr[0]); // print first array value

        // take input from user
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }

        // print array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

//        use for each loop
        for(int item:arr){
//            System.out.print(item+" ");
        }

        // print in 1 line
 //       System.out.println(Arrays.toString(arr));

//        array of objects
        String str[]=new String[5];

//        take input
        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();
        }

        // print string repr of the array
        System.out.println(Arrays.toString(str));
    }
}
