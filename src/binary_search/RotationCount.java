package binary_search;

public class RotationCount {
    public static void main(String[] args) {
        int arr[]={4,1,2,3};
        System.out.println(countRotations(arr));
    }

    public static int countRotations(int[] arr) {
        int pivot=findPivot(arr);
        return pivot+1;
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
