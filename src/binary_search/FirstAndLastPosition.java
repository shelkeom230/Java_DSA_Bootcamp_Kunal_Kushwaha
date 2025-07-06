package binary_search;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int arr[]={5,7,7,7,7,8,8,9,10};
        int target=7;
        int res[]=positions(arr,target);
        for(int item: res){
            System.out.print(item+" ");
        }
    }

//    brute force
    public static void FindPositions(int arr[],int target){
        int start=0,end=arr.length-1;
        int first=-1,last=-1;
        while (start<=end){
            if(arr[start]==target){
                first=start;
                break;
            }
            start+=1;
        }
        while(end>=0){
            if(arr[end]==target){
                last=end;
                break;
            }
            end-=1;
        }
        System.out.println("["+start+" , "+end+"]");
    }

//    helper function search
    public static int search(int arr[],int target,boolean isStartIndex){
        int start=0,end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid])
                end=mid-1;
            else if(target>arr[mid])
                start=mid+1;
            else{
                ans=mid;
                if(isStartIndex)
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return ans;
    }
//    better solution -- binary search modified
    public static int[] positions(int arr[],int target){
        int ans[]={-1,-1};
        ans[0]=search(arr,target,true);
        if(ans[0]!=-1){
            ans[1]=search(arr,target,false);
        }
        return ans;
    }
}

