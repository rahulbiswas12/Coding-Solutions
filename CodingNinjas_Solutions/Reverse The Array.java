// Given an array/list 'ARR' of integers and a position ‘M’. You have to reverse the array after that position.

import java.util.ArrayList;

public class Solution {
	public static void reverseArray(ArrayList<Integer> arr, int m) {

		int n = arr.size();

		// Declare and initialize ArrayList BRR.
		ArrayList<Integer> brr = new ArrayList<Integer>();

		for (int i = 0; i < arr.size(); i++) {
			brr.add(0);
		}

		// Declare a varibale P.
		int p = 0;

		// First fill the BRR in the same order as the original array upto Mth postion.
		for (int i = 0; i <= m; i++) {
			brr.set(p++, arr.get(i));
		}

		// Now fill the BRR in the reverse order till (m+1)th postion.
		for (int j = n - 1; j > m; j--) {
			brr.set(p++, arr.get(j));
		}

		// Now copy back the array brr into array ARR.
		for (int i = 0; i < n; i++) {
			arr.set(i, brr.get(i));
		}
	}
}

/*
    Time complexity: O(N)
    Space Complexity: O(N)

    Where N is the number of elements in the array.
    
 Given an array/list 'ARR' of integers and a position ‘M’. You have to reverse the array after that position.
Example:
We have an array ARR = {1, 2, 3, 4, 5, 6} and M = 3 , considering 0 
based indexing so the subarray {5, 6} will be reversed and our 
output array will be {1, 2, 3, 4, 6, 5}.
Input Format:
The very first line of input contains an integer ‘T’ denoting the number of test cases. 

The first line of every test case contains one integer ‘N’ where ‘N’ denotes the number of elements and an integer ‘M’ which denotes after which position the array has to be reversed.

The second line of every test case contains ‘N’ space-separated integers which denote the elements of input of array/list.
Output Format:
For each test case, return the required array.

Output for each test case is printed on a separate line.
Note:
You do not need to print anything, it has already been taken care of. Just implement the given function.

Consider 0-based indexing of the array.
Constraints:
1 <= T <= 10
0 <= M <= N <= 5*10^4
-10^9 <= ARR[i] <= 10^9

Time Limit: 1 sec
Sample Input 1:
2
6 3
1 2 3 4 5 6
5 2
10 9 8 7 6

Sample Output 1:
1 2 3 4 6 5
10 9 8 6 7
Explanation 1:
For the first test case, 
Considering 0-based indexing we have M = 3 so the 
subarray[M+1 … N-1] has to be reversed.
Therefore the required output will be {1, 2, 3, 4, 6, 5}.

For the second test case, 
Considering 0-based indexing we have M = 2 so the 
subarray[M+1 … N-1] has to be reversed.
Therefore the required output will be {10, 9, 8, 6, 7}.
*/
