import java.util.Scanner;
class Solution {	
	public static void main(String args[]) {		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		if(n < 0) {
			System.out.println("Error");
		}		
		else {
			int ans = 1;
			for(int i = 2; i <= n; i++) {
				ans *= i;
			}			
			System.out.println(ans);	
		}		
	}
}

/*
Write a program to find the factorial of a number.
Factorial of n is:
n! = n * (n-1) * (n-2) * (n-3)....* 1
Output the factorial of 'n'. If it does not exist, output 'Error'.
Input Format :
The only line of input contains a single integer.
Output Format :
The only line of output prints the Factorial of the number or "Error" if it doesn't exist.
Constraints:
-10 <= n <= 12
Sample Input 1 :
5
Sample Output 1 :
120
Explanation Of Sample Input 1:
5!=5*4*3*2*1=120
*/
