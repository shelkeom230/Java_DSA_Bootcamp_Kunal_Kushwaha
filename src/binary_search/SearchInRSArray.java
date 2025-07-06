package binary_search;

public class SearchInRSArray {
    public static void main(String[] args) {
        int arr[]={2,9,2,2,2};
        int target=9;
        System.out.println((search(arr,target)));
    }
    // main function which gives answer
    public static int search(int[] nums, int target) {
        int pivot=findPivotWithDuplicates(nums);
        // pivot not found,i.e array is not sorted rotated, apply normal binary search
        if(pivot==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }
//        if pivot is found
        // case 1 - target matches pivot , then return pivot index
        if(target==nums[pivot])
            return pivot;
        //case 2 - target>start, reduce search space to 0-pivot-1
        if(target>=nums[0])
            return binarySearch(nums,target,0,pivot-1);
        // case 3 - target<start, reduce search space to pivot+1,end
        else
            return binarySearch(nums,target,pivot+1,nums.length-1);
    }

//    normal binary search - used when pivot is not there, i.e array is not rotated and sorted
    public static int binarySearch(int arr[],int target,int start,int end){

        while (start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==target) return mid;
            else if(target<arr[mid]) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
    // finding the pivot element - this will not work for duplicate values
    public static int findPivot(int arr[]){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;

            // 4 cases
            // case 1 - mid>mid+1 ,mid is the pivot
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            // case 2 - mid<mid-1, mid-1 is the pivot
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            // case 3 - arr[start]>arr[mid], elements after mid are less than the first half, ignore them by end=mid-1
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }
            // case 4- arr[start]<arr[mid], pivot is in second half after the mid, so start=mid+1
            if(arr[start]<arr[mid]){
                start=mid+1;
            }
        }
        return -1;
    }

    // what if start,mid and end all are same
    public static int findPivotWithDuplicates(int arr[]){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;

            // 4 cases
            // case 1 - mid>mid+1 ,mid is the pivot
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            // case 2 - mid<mid-1, mid-1 is the pivot
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            // start,mid and end all are duplicates, so skip them if they are not pivot
            if(arr[start]==arr[mid] && arr[start]==arr[end]){
                // check if start is pivot
                if(arr[mid]>arr[mid+1])
                {
                    return mid;
                }
                start++;

                // check if end is pivot
                if(arr[mid]<arr[mid-1]){
                    return mid-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }

        }
        return -1;
    }

}
