package functions_exercises;

public class question12 {
    public static void main(String[] args) {
        int a=3,b=4,c=5;
        System.out.println(isTriplet(a,b,c));
    }
//    check for pythagoream triplet
    public static boolean isTriplet(int a,int b,int c){
        int greater=Math.max(a,Math.max(b,c));

        if(greater==a)
        {
            // just apply pythagorean triplet formula
            return b*b+c*c==a*a;
        }else if(greater==b){
            return a*a+c*c==b*b;
        }else {
            return a*a+b*b==c*c;
        }
    }
}
