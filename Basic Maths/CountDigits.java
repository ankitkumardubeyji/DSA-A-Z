/*
You are given a number ’n’.



Find the number of digits of ‘n’ that evenly divide ‘n’.



Note:
A digit evenly divides ‘n’ if it leaves no remainder when dividing ‘n’.


Example:
Input: ‘n’ = 336

Output: 3

Explanation:
336 is divisible by both ‘3’ and ‘6’. Since ‘3’ occurs twice it is counted two times.

*/

public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        int c=0;
        int a = n;
        int r=0;
        while(n!=0){
            r = n % 10; // extracting the rightmost digit from the number 
            if(r!=0 && a%r==0){ // checking if the number is divisible from the extracted right most digit 
                c++;
            }
            n = n/10; // removing the right most digit from the number 
        }
        return c;
    }
}
// TC: O(n) , where n is the no of digit present in the number 