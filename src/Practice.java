import java.sql.Array;
import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        int arr[] = {3,4,-1,1};
//        System.out.println(find_first_missing_positive(arr));
        Student omkar=new Student();
        System.out.println(omkar.rno);
        System.out.println(omkar.name);
        System.out.println(omkar.marks);
    }

    // cyclic sort using for loop
    public static int[] cyclic_sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
//                swap
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
        }
        return arr;
    }

    // function to swap array elements
    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // cyclic sort using while loop
    // cyclic sort is used to sort an array with
    // elements in the range [1--M]
    public static void cyclic_sort_while(int arr[]) {
        int n = arr.length;
        int i = 0;

        // traverse the array
        while (i < n) {
            // calculate correct index
            int correctIndex = arr[i] - 1;

            // swap if element not at correct index
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                // move on to next index
                i++;
            }
        }
    }

    // find missing number in array using cyclic sort
    public static int missing_number(int arr[]) {
        int n = arr.length;

        int i = 0;

        // traverse the array & run cyclic sort
        while (i < n) {
            // correct index for any element is the element itself
            // consider only those elements which are less than array size as we need to find missing number
            int correctIndex = arr[i];

            if (arr[i] < n && arr[i] != arr[correctIndex]) {
                //swap
                swap(arr, i, correctIndex);
            } else {
                // move on to next index
                i++;
            }
        }

        // case 1 ---> check if element not equal to it's index value
        for (int j = 0; j < n; j++) {
            if (arr[j] != j) return j;
        }

        // case 2 ---> missing element is equal to n only
        return n;
    }

    //  find all numbers disappeared in an array - [1--N] range
    public static ArrayList<Integer> find_all_missing_numbers(int[] arr) {
        int n = arr.length;

        // run cyclic sort
        int i = 0;

        ArrayList<Integer> res = new ArrayList<>();
        while (i < n) {
            // calculate correct index
            int correctIndex = arr[i] - 1;

            // check if element is in the range of 1 to n only
            if (arr[i] >= 1 && arr[i] <= n && arr[i] != arr[correctIndex]) {
                //swap
                swap(arr, i, correctIndex);
            } else {
                // move on to next index
                i++;
            }
        }

        // find all missing elements
        for (int j = 0; j < n; j++) {
            if (arr[j] != j + 1) res.add(j + 1);
        }
        return res;
    }


    // find the duplicate number - only 1 duplicate number
    public static int find_duplicate_number(int arr[]) {
        int n = arr.length;
        int i = 0;

        // run cyclic sort
        while (i < n) {
            // calculate correct index
            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {
                //swap
                swap(arr, i, correctIndex);
            } else {
                // move on to next index
                i++;
            }

        }

        int dup = -1;
        // find the duplicate number
        for (int j = 0; j < n; j++) {
            // j+1 is the missing as well as arr[j] is repeating number
            if (arr[j] != j + 1) {
                dup = arr[j];
                break;
            }
        }
        return dup;
    }

    // find all duplicates -- more than 1 are there
    public static ArrayList<Integer> all_dup(int arr[]){
        int n=arr.length;

        int i=0;

        // run cyclic sort
        while(i<n){
            int correctIndex=arr[i]-1;

            if(arr[i]>=1 && arr[i]<=n && arr[i]!=arr[correctIndex]){
                //swap
                swap(arr,i,correctIndex);
            }else{
                // move on to next index
                i++;
            }
        }

        // find all duplicates
        ArrayList<Integer> ans=new ArrayList<>();
        for(int j=0;j<n;j++){
            if(arr[j]!=j+1) {
            // check for duplicates first
                if(!ans.contains(arr[j])) ans.add(arr[j]);
            }
        }
        return ans;
    }

    // finding duplicate and missing number -- set mismatch
    public static int[] find_dup_missing(int arr[]){
        int n=arr.length;

        int i=0;
        int dup=-1,missing=-1;
        // run cyclic sort
        while(i<n){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                //swap
                swap(arr,i,correctIndex);

            }else{
                i++;
            }
        }

        // find missing and dup , dup=arr[j] & missing=j+1
        for(int j=0;j<n;j++){
            if(arr[j]!=j+1){
                dup=arr[j];
                missing=j+1;
            }
            if(dup!=-1 && missing!=-1) break;
        }
        int res[]={dup,missing};
        return res;
    }

    // find the first missing +ve number
    public static int find_first_missing_positive(int arr[]){
        int n=arr.length;
        int i=0;

        // run cyclic sort
        while (i<n){
            int correctIndex=arr[i]-1;
            if(arr[i]>0 && arr[i]<=n && arr[i]!=arr[correctIndex]){
                //swap
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }

//        case 1 --> find first missing +ve if it is in range of [1--N]
        for(int j=0;j<n;j++){
            // arr[j] is dup whereas j+1 is missing
            if(arr[j]!=j+1) return j+1;
        }

        // case 2--> if all numbers from [1--N] are present then N+1 is missing
        return n+1;
    }
}

// create a class
class Student{
    int rno;
    String name;
    double marks;
}