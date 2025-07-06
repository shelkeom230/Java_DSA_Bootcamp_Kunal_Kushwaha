package all_sorting;

public class Quick_sort {
    public static void main(String[] args) {
    int arr[]={5,3,4,2,1};
    quick_sort(arr,0,arr.length-1);
    for(int item: arr){
        System.out.print(item+" ");
    }
    }
    //swap helper function
    public static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    public static void quick_sort(int arr[],int low,int hi){
        if(low>=hi) return;
        // take 2 pointers for swapping
        int start=low;
        int end=hi;

        // find mid index
        int mid=start+(end-start)/2;

        // take middle as pivot for best case - 0(NlogN)
        int pivot=arr[mid];

        while (start<=end){
            // find voilations
            // find the first element from left greater than pivot
            while(arr[start]<pivot){
                start++;
            }

            // find the first element from right less than pivot
            while (arr[end]>pivot){
                end--;
            }

            if(start<=end)
            {
                //swap
                swap(arr,start,end);
                start++;
                end--;
            }
        }

        // now pivot is at it's correct index
        // sort the halves now
        quick_sort(arr,low,end);
        quick_sort(arr,start,hi);
    }
}
