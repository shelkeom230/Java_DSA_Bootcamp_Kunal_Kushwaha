package binary_search;

public class MountainPeakElement {
    public static void main(String[] args) {
    int arr[]={1,2,3,5,6,4,3,2};
        System.out.println(mountainPeakElement(arr));

    }

    // find mountain peak in an array - bitonic array
    public static int mountainPeakElement(int nums[]){
        int start=0,end=nums.length-1;

        while (start<end){
            int mid=start+(end-start)/2;

            if(nums[mid]>nums[mid+1]){
                // you are in desc part of array
                // may be mid can be possible ans, but we need to check left part as well
                // why end=mid, as mid index is also considered as possible answer
                end=mid;
            }else{
                // you are in asc part of array
                // answer lies towards right part
                // start=mid+1 to get all greater elements
                start=mid+1;
            }
            // in the end, start == end and pointing to the largest number because of the 2 checks above
            // start and end are always trying to find max element in the above 2 checks
            // hence, when they are pointing to just one element, that is the max one because that is what the checks say
            // more elaboration: at every point of time for start and end, they have the best possible answer till that time
            // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        }
            return start; // or return end as start == end
    }
}
