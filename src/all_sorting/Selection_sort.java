package all_sorting;

public class Selection_sort {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        selection_sort(arr);
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

    // selection sort
    public static void selection_sort(int arr[]){
        int n=arr.length;

        for(int i=0;i<n;i++){
            // assume first element as minimum
            int min=i;

            // find minimum element
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            //swap
            swap(arr,i,min);
        }
    }
}
