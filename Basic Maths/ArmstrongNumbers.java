/*
You are given an integer 'n'.

Return 'true' if 'n' is an Armstrong number, and 'false' otherwise.

Note:
An Armstrong number is a number (with 'k' digits) such that the sum of its digits raised to 'kth' power is equal to the number
 itself. For example, 371 is an Armstrong number because 3^3 + 7^3 + 1^3 = 371.

*/


import java.util.Scanner;

public class Main {

	public static int Count(int n){
		int  c = 0;
		while(n!=0){
			c++;
			n = n/ 10;
		}
		return c;
	}
	
	public static void main(String[] args) {
		// Write your code here
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int count = Count(n);
			int a = n;
			int r=0,s=0;
			while(a!=0){
				r = a%10;
				s = s + (int)Math.pow(r,count);
				if(s>n){
					System.out.println("false");
					return;
				}
				a =a /10;
			}
			if(s==n){
				System.out.println("true");
			}
			else{
			System.out.println("false");
			}
	}
}
