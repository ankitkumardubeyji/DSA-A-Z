
class Solution {

// ApproachI: Using Strings
// TC: O(n) , time complexity of the equals function O(n)
  public boolean isPalindrome(int x) {
        String s = x + "";
        String st = "";
        for(int i=0;i<s.length();i++){
            st = s.charAt(i) + st;
        }
        return s.equals(st);
    }




// Approach II: 
    public int countDigits(int n){
        int c = 0;
        while(n!=0){
            n = n/10;
            c++;
        }
        return c;
    }



  public boolean isPalindromeBetter(int x) {
        if(x<0){
            return false;
        }

        int ld = 0;
        int rd = 0;
        int cd = countDigits(x);

        

        while(x!=0 && cd>1){
             rd = x%10;
             ld = x / (int)Math.pow(10,cd-1);
             System.out.println(ld +" "+rd);
            if(ld!=rd){
                return false;
            }
           
            x = x % (int)Math.pow(10,cd-1);
            x = x /10;
             cd = cd - 2;
        }
        return true;    


    }

    // Approach 3 : the best optimised approach : O(n)
    public boolean isPalindromeOptimised(int x) {
        if(x<0){
            return false;
        }

        int rev = 0;
        int r = 0;
        int a = x;
        while(a!=0){
            r = a %10;
            rev = (rev*10)+r;
            a = a/10;
        }
        return rev == x;
    }
}