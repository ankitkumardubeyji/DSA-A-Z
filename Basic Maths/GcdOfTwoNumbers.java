public class Solution {
    
    // Brute Force : Tc : O(min(m,n))
    public static int calcGCD(int n, int m){
        // Write your code here.
        int mini = Math.min(m,n);
        int maxi = Math.max(m,n);
        for(int i=mini;i>=1;i--){
            if(maxi%i==0 && mini %i==0 ){
                return i;
            }
        }
        return 1;
    }

    // Approach II : Using Recursion : Euclidean Algorithm : TC: O(log(min(m,n)))
    
     public static int calcGCD(int n, int m){
        // Write your code here.
        if(n%m==0){
            return m;
        }

        return calcGCD(m,n%m); // the remainder of the current state becomes quotient for the next state 
        // and the current quotient becomes the dividend from the next state .
    }
}