/*

You are given an integer ’n’.

Your task is to return a sorted array (in increasing order) containing all the factorial numbers which are less than or equal to ‘n’.


The factorial number is a factorial of a positive integer, like 24 is a factorial number, as it is a factorial of 4.



Note:
In the output, you will see the array returned by you.
Example:
Input: ‘n’ = 7

Output: 1 2 6
*/

import java.util.ArrayList;
import java.util.List;
public class Solution {

    public static void factorial(long n,long f,int i,List<Long>ls){
        if(f*i>n){
            return;
        }
        ls.add(f*i);
        factorial(n, f*i, i+1, ls);
    }
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        List<Long> ls = new ArrayList<Long>();
         factorial(n,1,1,ls);
         return ls;
    }
}