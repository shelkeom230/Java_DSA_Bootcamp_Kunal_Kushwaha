package all_sorting;

import java.util.ArrayList;

public class Merge_sort {
    public static void main(String[] args) {
    int arr[]={4,1,2,3};
    merge_sort(arr,0,arr.length-1);
    for(int item: arr){
        System.out.print(item+" ");
    }
    }
    public static void merge(int arr[],int low,int mid,int high){
        int left=low;
        int right=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();

        // append the smaller elements first
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        // add remainig elements if any
        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }

        while(right<=high){
            temp.add(arr[right]);
            right++;
        }

        // copy back temp to arr
        for(int i=low;i<=high;i++){
            arr[i]= temp.get(i-low);
        }
    }
    public static void merge_sort(int arr[],int low,int high){
        if(low>=high) return;
        int mid=low+(high-low)/2;

        merge_sort(arr,low,mid);
        merge_sort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
}
