package binary_search;

public class Ceiling {
    public static void main(String[] args) {
    int arr[]={2,3,5,9,14,16,18};
    int target=15;
        System.out.println(ceiling(arr,target));
    }

    // ceiling --> smallest number greater than equal to target
    public static int ceiling(int arr[],int target){
//        what if target is greater than the greatest element
        if(target>arr[arr.length-1]) return -1;

        int start=0,end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target==arr[mid])
                return mid;
            else if(target<arr[mid])
                end=mid-1;
            else
                start=mid+1;

        }
        return start;

    }
}
