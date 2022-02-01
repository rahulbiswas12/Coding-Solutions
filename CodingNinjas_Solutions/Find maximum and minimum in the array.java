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


        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }
        
        System.out.println("Maximum Value = " + max);
        System.out.println("Minimum Value = " + min);
}
}

/*
Input:
4
1 13 10 21


Output:
Maximum Value = 21
Minimum Value = 1
 */
