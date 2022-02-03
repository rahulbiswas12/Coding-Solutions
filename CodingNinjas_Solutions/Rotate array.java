// Given an array with N elements, the task is to rotate the array to the left by K steps, where K is non-negative.

import java.util.Scanner;
class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of elements
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {   // Initializing array elements
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();   // No. of times to rotate
        rotateArray(arr, n, k);
    }
    static void rotateArray(int arr[], int n, int k) {
        
        for (int i = 0; i < k; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++)
                arr[j] = arr[j + 1];    
            arr[n - 1] = temp;
        }        
        for (int i = 0; i < n; i++) {     //printing array
            System.out.print(arr[i] + " ");
        }
    }

}

/*
Given an array with N elements, the task is to rotate the array to the left by K steps, where K is non-negative.
Input Format:
The first line contains an integer N representing the size of the array.

The second line contains N space-separated integers representing the elements of the array.

The last line contains an integer K representing the number of times the array has to be rotated in the left direction. 
Output Format:
The only line of the output prints N space-separated integers representing the Rotated array elements.
Constraints:
1 <= N <= 10^3
1 <= arr[i] <= 10^9
1 <= K < N
Sample Input:
8
7 5 2 11 2 43 1 1
2
Sample Output:
2 11 2 43 1 1 7 5
Explanation Of Sample Input:
Rotate 1 steps to the left: 5 2 11 2 43 1 1 7
Rotate 2 steps to the left: 2 11 2 43 1 1 7 5
*/
