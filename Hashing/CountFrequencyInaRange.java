/*
You are given an array 'arr' of length 'n' containing integers within the range '1' to 'x'.



Your task is to count the frequency of all elements from 1 to n.

Note:
You do not need to print anything. Return a frequency array as an array in the function such that index 0 represents the frequency of 1, index 1 represents the frequency of 2, and so on.
Example:
Input: ‘n’ = 6 ‘x’ = 9 ‘arr’ = [1, 3, 1, 9, 2, 7]    
Output: [2, 1, 1, 0, 0, 0]
Explanation: Below Table shows the number and their counts, respectively, in th

*/

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums); 
        int left = 0; int right = 0; // sliding window
        long sum = nums[0] ; int ans = 0;                                                 //<----------
        while(right<nums.length){
            if(nums[right] * (long) (right - left + 1) <= k + sum){             // <----------
                ans = Math.max(ans, right - left + 1);
                right++;
                if(right<nums.length) sum+= nums[right];
            }
            else{
                sum-=nums[left];
                left++;
            }
        }
        return ans;
    }
}