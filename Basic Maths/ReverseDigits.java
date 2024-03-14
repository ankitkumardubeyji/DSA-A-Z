

/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21

*/


// Encountered Edge cases in the problem

// 1 : x = -2147483648
// 2: x = 1534236469


class Solution {
    public int reverse(int x) {
        int sign = 1;
        if(x<0){
            sign = - 1;
        }
        long num  = x;  // storing the number in the long format to encounter the edge case 
                            // -2147483648 , as taking directly its abs and storing in the int num
                            // will cause the overflow

        num = Math.abs(num);
        // we have taken the all the variables as long to encounter the case when the reverse becomes 
        // greater than the INT_MAX can be successfully  stored in them and the edge case can be encountered  
        long r =0;
        long rev = 0;
        while(num!=0){
            r = num%10; // extracting the right most digit from the number 
            rev = (rev*10) + r; // shifting the number to one place left and adding the extracted number 
            if(rev>Integer.MAX_VALUE){
                return 0;
            }
            num = num / 10; // removing the right most digit from the number .
        }
        return (int)rev*sign;
    }
}

// TC: O(n) , where n is the no of digits in the number 