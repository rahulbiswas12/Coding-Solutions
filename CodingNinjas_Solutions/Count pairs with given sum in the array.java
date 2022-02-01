import java.io.*;
import java.util.*;

public class Example {
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n ; i++) {
        arr[i] = sc.nextInt();
    }
    
        int sum = sc.nextInt();
        int count = 0; // Initialize result
    
        // Consider all possible pairs and check their sums
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] + arr[j] == sum)
                    count++;
        System.out.println("Count of pairs is " + count);
   }
}

/*
Input:
5 
1 1 2 2 3
3


Output:
Count of pairs is 3
*/
