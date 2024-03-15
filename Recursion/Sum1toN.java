/*
You are given an integer ‘n’.
Your task is determining the sum of the first ‘n’ natural numbers and returning it.

Example:
Input: ‘n’ = 3

Output: 6

Explanation: The sum of the first 3 natural numbers is 1 + 2 + 3, equal to 6.
*/

public class Solution {
 static int mod = 1000000007;
    public static long sumFirstN(long n) {
        // Write your code here.
            if(n<0){
                return 0;
            }
            return (n + (sumFirstN(n-1))%mod)%mod;
    }
}