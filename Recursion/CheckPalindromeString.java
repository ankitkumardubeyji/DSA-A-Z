/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

*/

class Solution {

    public boolean check(String s,int lb,int ub){
        if(lb>=ub){
            return true;
        }
        if(!Character.isLetterOrDigit(s.charAt(lb))){
            return check(s,lb+1,ub);
        }
        if(!Character.isLetterOrDigit(s.charAt(ub))){
            return check(s,lb,ub-1);
        }
        if(Character.toLowerCase(s.charAt(lb)) != Character.toLowerCase(s.charAt(ub))){
            return false;
        }
        else{
            return check(s,lb+1,ub-1);
        }
    }

    public boolean isPalindrome(String s) {
       
        return check(s,0,s.length()-1);
    }
}