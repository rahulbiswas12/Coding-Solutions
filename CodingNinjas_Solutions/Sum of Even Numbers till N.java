import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		int i = 0;
         	while(i <= n){
    			sum = sum + i;
    			i = i + 2;
  		}
		System.out.println(sum);
	}
}

/*
Input Format :
Integer N
Output Format :
Required Sum 

Sample Input 1 :
 6
Sample Output 1 :
12
*/

______________________________________________________________

public class Solution {
	public static long evenSumTillN(int n) {
		long sum = 0;
		int i = 2;
		while (i <= n) {
			sum += i;
			i += 2;
		}
		return sum;
	}
}

--------------------------------------------------------------
/*
You have been given a number 'N'. Your task is to find the sum of all even numbers from 1 to 'N' (both inclusive).
Example :
Given 'N' : 6
Sum of all even numbers till 'N' will be : 2 + 4 + 6 = 12
Input Format :
The first line of the input contains an integer 'T', denoting the number of test cases.

The first line and the only line of each test case contains an integer 'N'.
Output Format :
For each test case, print a single integer representing the sum of even numbers till 'N'.

Print a single line for each test case.
Note:
You do not need to print anything, it has already been taken care of. Just implement the given function.
Constraints :
1 <= T <= 10
1 <= N <= 10^5

Time Limit: 1 sec
Sample Input 1 :
2
6
2
Sample Output 1 :
12
2

*/
