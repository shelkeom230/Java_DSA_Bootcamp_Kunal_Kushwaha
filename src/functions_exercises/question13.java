package functions_exercises;

public class question13 {
    public static void main(String[] args) {
    int a=1,b=100;
    printPrimeInRange(a,b);
    }
//    check prime number
    public static boolean checkPrime(int n){
        if(n<2)
            return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
//    prime numbers in a range
    public static void printPrimeInRange(int a,int b){
        for(int i=a;i<=b;i++)
        {
            if(checkPrime(i))
                System.out.print(i+" ");
        }
    }
}
