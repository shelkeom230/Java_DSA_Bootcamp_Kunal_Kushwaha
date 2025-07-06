package binary_search;

public class Floor {
    public static void main(String[] args) {
    int arr[]={2,3,5,9,14,16,18};
    int target=15;
        System.out.println(Floor(arr,target));
    }

    // floor --> greatest number smaller than equal to target
    public static int Floor(int arr[],int target){
        // what if target is less than the smallest element
        if(target<arr[0]) return -1;

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
        return end;

    }
}
