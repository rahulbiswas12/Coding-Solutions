import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of elements
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {    // Initializing array elements
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt(); // Element whose index to be searched
        lastIndex(arr, n, x);
    }
    static void lastIndex(int[] arr, int n, int x) {       // Function for finding last occurrence
        int last = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (x == arr[i]) {
                last = i;
                break;
            }
        }
        System.out.println(last);
    }
}

/*
Take an array with N elements with possibly duplicate elements as the input. The task is to find the index of the last occurrences of the element x in the array and, if it is not present, return -1.
Input Format:
The first line contains an integer N representing the size of the array.

The next line contains N space-separated integers representing the elements of the array.

The last line contains an integer 'x' whose index has to be found.
Output Format:
The only line of the output prints the Index or -1.
Constraints:
1 <= N <= 10^3
1 <= arr[i] <= 10^9
1 <= x < N
Sample Input 1 :
8
7 5 2 11 2 43 1 1
2
Sample Output 1 :
4
Explanation Of Sample Input 1:
2 is present twice in the input array and the last time it appears is at index 4.
*/
