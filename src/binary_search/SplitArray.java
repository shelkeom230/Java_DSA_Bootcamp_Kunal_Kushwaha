package binary_search;

public class SplitArray {
    public static void main(String[] args) {
        int arr[]={7,2,5,10,8};
        int k=2;
        System.out.println(splitArray(arr,k));
    }

    public static int splitArray(int nums[],int k){
        int start=0; // max number from the array
        int end=0; // sum of the array
        for (int i = 0; i < nums.length; i++) {
            start=Math.max(start,nums[i]);
            end+=nums[i]; // at the end, start will have max num and end will have total array sum
        }

        // binary search
        while (start<end)
        {
            // try to select mid as the potential ans
            int mid=start+(end-start)/2;

            int sum=0;
            int pieces=1;

            for(int num:nums){
                if(sum+num>mid){
                    // you cannot add this num to the current subarray ,
                    // add it in the new subarray and update sum=num
                    sum=num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }
            if(pieces>k){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return end; // or return start as start==end at last
    }
}
