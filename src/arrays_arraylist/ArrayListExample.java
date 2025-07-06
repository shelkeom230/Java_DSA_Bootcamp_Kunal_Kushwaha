package arrays_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(10);
        list.add(20);
        list.add(25);

//        add 10 at index 0
        list.add(0,10);

//        get value at particular index
        System.out.println(list.get(0)); // 10

        // check if 10 is present in list
//        System.out.println(list.contains(10)); // true
//        System.out.println(list);

        // delete elements
        list.removeLast(); // remove the element at last index
        list.removeFirst(); //remove the element at first index

//        remove at specified index
        list.remove(0); // removes 10
//        System.out.println(list);
    
        // take input using scanner 

        Scanner in=new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

//        print the list
        for(int item:list){
            System.out.print(item+" ");
        }
    }

}
