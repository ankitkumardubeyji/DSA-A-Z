/*
Given an array 'v' of 'n' numbers.



Your task is to find and return the highest and lowest frequency elements.


If there are multiple elements that have the highest frequency or lowest frequency, pick the smallest element.



Example:
Input: ‘n' = 6, 'v' = [1, 2, 3, 1, 1, 4]

Output: 1 2

Explanation: The element having the highest frequency is '1', and the frequency is 3. The elements with the lowest frequencies are '2', '3', and '4'. Since we need to pick the smallest element, we pick '2'. Hence we return [1, 2].
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
6
1 2 3 1 1 4
Sample Output 1 :
1 2
Sample Explanation 1:
Input: ‘n' = 6, 'v' = [1, 2, 3, 1, 1, 4]

Output: 1 2

Explanation: The element having the highest frequency is '1', and the frequency is 3. The elements with the lowest frequencies are '2', '3', and '4'. Since we need to pick the smallest element, we pick '2'. Hence we return [1, 2].
Sample Input 2 :
6
10 10 10 3 3 3
Sample Output 2 :
3 3
Sample Explanation 2:
Input: ‘n' = 6, 'v' = [10, 10, 10, 3, 3, 3]

Output: 3 3

Explanation: Since the frequency of '3' and '10' is 3. Therefore, the element with the maximum and minimum frequency is '3'.
Expected Time Complexity :
The expected time complexity is O(n), where n is the size of the array.
Expected Space Complexity :
The expected time complexity is O(n), where n is the size of the array.
Constraints :
2 <=  n <= 10^4
1 <= v[i] <= 10^9
There are at least two distinct elements in the array.
Time Limit: 1 sec 


*/

import java.util.HashMap;
import java.util.*;

public class Solution {
    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
          //  Arrays.sort(v);
            TreeMap<Integer,Integer> hm = new TreeMap<>();
            int mini = 0;
            int maxi = 0;
   
            for(int i=0;i<v.length;i++){
                hm.put(v[i],hm.getOrDefault(v[i],0)+1);
            }


            int lf = Integer.MAX_VALUE;
            int hf = Integer.MIN_VALUE;
            
            for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
                if(hf<(Integer)(entry.getValue())){
                    hf = (Integer)(entry.getValue());
                    maxi = (Integer)(entry.getKey());
                }
                if(lf>(Integer)(entry).getValue()){
                    lf = (Integer)(entry.getValue());
                    mini = (Integer)(entry.getKey());
                }
                
            }
            
            int arr[] = new int[2];
            arr[0] = maxi;
            arr[1] = mini;
            return arr;
    }
}