package functions_exercises;

public class question14 {
    public static void main(String[] args) {
        int n=10;
        System.out.println(sumFirstN2(n));
    }

//    sum of first n natural numbers iterative method it is
    public static int sumFirstN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

//    sum of first n natural numbers using formula
public static int sumFirstN2(int n) {
    int sum = (n*(n+1))/2;
    return sum;
}

}
