/*
The frequency of an element is the number of times it occurs in an array.

You are given an integer array nums and an integer k. In one operation, you can choose an index of nums and increment the element at that index by 1.

Return the maximum possible frequency of an element after performing at most k operations.

Example 1:

Input: nums = [1,2,4], k = 5
Output: 3
Explanation: Increment the first element three times and the second element two times to make nums = [4,4,4].
4 has a frequency of 3.

*/

class Solution {
    public int maxFrequency(int[] nums, int k) {
        // we can use the sliding window approach , where continously we gonna to increase the window size and check all the elements of the window can be made equal to the largest element in the window.

// first we will be sorting the array and will be ensuring that last element of the window is the largest element  of the window.

// and the criteria for increasing the window size is
// sum of all the elements required up to index right should be less than the maximum sum possible up to the index right
// greatest_el * (right - left + 1) <= k + sum(sum of the elements up to right)
    
    int left = 0;
    int right = 0;
    int ans = 0;
    Arrays.sort(nums);
    long sum = nums[0];
    while(right<nums.length){
        
        if((right-left+1) * (long)nums[right]<= k + sum){
            ans = Math.max(ans,right-left+1); 
            right++;
            if(right<nums.length){
                sum = sum + nums[right];
            }
            
        }
        else{
            sum = sum - nums[left];
            left++;
        }
    }
    return ans;
    }
}