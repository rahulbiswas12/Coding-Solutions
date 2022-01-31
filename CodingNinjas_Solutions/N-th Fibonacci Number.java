public class Solution{
    static int[][] multiply(int[][] a, int[][] b) {
        int mod = (int) (1e9 + 7);
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = 0;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    c[i][k] = (int) ((c[i][k] + (long) ((long) a[i][j] * (long) b[j][k])) % mod);
                }
            }
        }
        return c;
    }
    static int[][] matrix_power(int[][] coef, int n) {
        int[][] res = {{1, 0}, {0, 1}};
        while (n > 0) {
            if (n % 2 != 0) res = multiply(res, coef);
            coef = multiply(coef, coef);
            n /= 2;
        }
        return res;
    }
    public static int fibonacciNumber(int n) {
        int[][] coef = {{0, 1}, {1, 1}};
        int[][] res = matrix_power(coef, n - 1);
        return res[1][1];
    }
}

--------------------------------------------------------------------------
  Python -
  
  def fibonacciNumber(n):
    mod = int(1e9 + 7)
    a = 0 
    b = 1 
    for i in range(2, n + 1):
        c = (a + b) % mod
        a = b
        b = c
    return b
    --------------------------------------------------------------------------

/*
You are given an integer ‘N’, your task is to find and return the N’th Fibonacci number using matrix exponentiation.
Since the answer can be very large, return the answer modulo 10^9 +7.
Fibonacci Number Is Calculated Using The Following Formula:
F(n) = F(n-1) + F(n-2), 
Where, F(1) = F(2) = 1.
For Example:
For ‘N’ = 5, the output will be 5.
Input Format:
The first line contains a single integer ‘T’ denoting the number of test cases to be run. Then the test cases follow.

The first line of each test case contains a single integer ‘N’, representing the integer for which we have to find its equivalent Fibonacci number.
Output Format:
For each test case, print a single integer representing the N’th Fibonacci number.

Return answer modulo 10^9 + 7.

Output for each test case will be printed in a separate line.
Note:
You are not required to print anything; it has already been taken care of. Just implement the function.
Constraints:
1 <= T <= 100
1 <= N <= 10^9

Time Limit: 1 sec.
Follow Up:
Can you solve it in Time Complexity better than O(N)?
Sample Input 1:
2
10
7
Sample Output 1:
55
13
*/
