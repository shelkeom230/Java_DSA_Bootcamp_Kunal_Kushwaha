package all_sorting;

public class Bubble_sort {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        bubble_sort(arr);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    // bubble sort - 0(N^2)
    public static void bubble_sort(int arr[]) {
        int n=arr.length;
        boolean isSwapped=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                    isSwapped=true;
                }
            }
            if(isSwapped==false) break;
        }
    }
}
