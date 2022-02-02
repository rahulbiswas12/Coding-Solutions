import java.util.Scanner;
class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        firstIndex(arr, n, x);
    }
    static void firstIndex(int[] arr, int n, int x) {
        int first = -1;
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                first = i;
                break;
            }
        }
        System.out.println(first);
    }
}


/*
Take an array with n elements with possibly duplicate elements as the input. The task is to find the index of the first occurrences of the element x in the array and, if it is not present, return -1.
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
2
Explanation Of Sample Input 1:
2 is present twice in the input array and the first time it appears is at index 2.
*/
