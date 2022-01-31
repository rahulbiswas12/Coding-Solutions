import java.util.*;
public class Solution {
	public static int countSetBits(int n) {
		int count = 0;
		while (n > 0) {
			count += n & 1;
			n >>= 1;
		}
		return count;
	}
}

/*
Write a program to count the number of 1's in the binary representation of an integer.
Input Format :
 The only line of input contains a single integer N.
Output Format :
The only line of the output prints the total number of 1.
Constraints
1 <= N <= 100
Sample Input 1:
9
Sample Output 1:
2
Explanation Of Sample Input 1:
Binary Representation of 9 is 1001.
*/
