import java.util.*;
class Solution {
	public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        int p =1;
		for(int i=1;i<=x;i++)
        {
            p=p*n;
        }
        System.out.println(p);
	}
}

/*
Write a program to find x to the power n (i.e., x^n). Take x and n from the user. You need to print the answer.
Note: For this question, you can assume that 0 raised to the power of 0 is 1
Input Format :
The only line of input contains two integers x and n separated by a single space.
Output Format :
The only line of output prints the power of the number.
Constraints:
0 <= x <= 8 
0 <= n <= 9
Sample Input 1 :
 3 4
Sample Output 1 :
81
*/
