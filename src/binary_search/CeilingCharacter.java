package binary_search;

public class CeilingCharacter {
    public static void main(String[] args) {
    char letters[]={'c','f','j'};
    char target='c';
        System.out.println(CeilingCharacter(letters,target));
    }

    // next greater char --> smallest char after target
    public static char CeilingCharacter(char letters[],int target){
        int start=0,end=letters.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<letters[mid])
                end=mid-1;
            else
                start=mid+1;

        }
        return letters[start % letters.length];
    }
}
