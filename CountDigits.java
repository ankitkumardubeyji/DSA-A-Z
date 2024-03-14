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
