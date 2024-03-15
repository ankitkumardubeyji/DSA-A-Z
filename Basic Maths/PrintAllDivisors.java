





// 30 test cases passed : giving time limit exceeded
public class Solution {

   public static int CountofDivisors(int n){
        double a = n*1.0;
        int c = 0;
        for(int i=1;i<=Math.sqrt(a);i++){
            if(n%i==0){
                c = c+i;
                if(n/i != i){
                    c = c + n/i;
                }
            }
        }
        return c;
    }
    public static int sumOfAllDivisors(int n){
        int s=0;
        // Write your code here.
        for(int i=1;i<=n;i++){
            s = s+ CountofDivisors(i);
        }
        return s;
    }
}