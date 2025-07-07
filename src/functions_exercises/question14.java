package functions_exercises;

public class question14 {
    public static void main(String[] args) {
        int n=10;
        System.out.println(sum_first_n_recursive(n,1,0));
    }

//    sum of first n natural numbers iterative method it is
    public static int sumFirstN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    // sum of first n natural numbers recursive method it is
    public static int sum_first_n_recursive(int n,int i,int sum){
        if(i>n) return sum;
        return sum_first_n_recursive(n,i+1,sum+=i);
    }

//    sum of first n natural numbers using formula
public static int sumFirstN2(int n) {
    int sum = (n*(n+1))/2;
    return sum;
}

}
