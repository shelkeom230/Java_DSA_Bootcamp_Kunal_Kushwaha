package all_sorting;

public class Insertion_sort {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        insertion_sort(arr);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
    // swap helper function
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    // insertion sort -- insert each element at it's correct place
    public static void insertion_sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                //swap
                swap(arr,j-1,j);
                j--;
            }
        }
    }
}
