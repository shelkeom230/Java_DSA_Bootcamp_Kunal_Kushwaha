package binary_search;

public class InfiniteArrayBS {
    public static void main(String[] args) {
    int arr[]={2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,18};
    int target=3;
        System.out.println(ans(arr,target));
    }

//    search in an infinite sorted array
    public static int ans(int arr[],int target){
        // determine the window size
        int start=0;
        int end=1;
        while(target>arr[end]){
            // get the new start
            int newStart=end+1;

            // update the end
            // end=end+(end-start+1)*2 or end+(window size)*2
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return binarySearch(arr,target,start,end);
    }

    // binary search code
    public static int binarySearch(int arr[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid])
                end=mid-1;
            else if(target>arr[mid])
                start=mid+1;
            else
                return mid;
        }
        return -1;
    }
}
