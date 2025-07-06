package arrays_arraylist;

public class PassingArraysToFunc {
    public static void main(String[] args) {
            int nums[]={2,3,4,12};

            change(nums);

            for(int ele:nums){
                System.out.println(ele);
            }
    }
    static void change(int arr[]){
        arr[0]=99;
    }
}
