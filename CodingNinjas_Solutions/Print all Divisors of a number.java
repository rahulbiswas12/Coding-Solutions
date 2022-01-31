import java.util.Scanner;
class Solution {
	public void printDivisor(int n) {
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}	
	public static void main(String args[]) {
		Solution obj = new Solution();
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		obj.printDivisor(n);
	}
}

/*
Write a function to print all divisors of a number.
Divisors Are The Numbers That Divide The Number Entirely And Leaves No Remainder.
Input Format :
The only line of input contains a natural number N.
Output Format :
The only line of the output prints the Space Separated divisors of N.
Constraints :
1 <= N <= 10ˆ3 
Sample Input 1 :
10
Sample Output 1 :
1 2 5 10
*/
