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
          int x = sc.nextInt(); //Element to be searched
        
          int result = search(arr, arr.length, x);
          if (result == -1)
              System.out.println("Element is not present in array");
          else
              System.out.println("Element is present at index " + result);
    
}
static int search(int[] arr, int n, int x) {
          int i;
          for (i = 0; i < n; i++)
              if (arr[i] == x)
                  return i;
          return -1;
      }
}

/*
Input:
3
1 2 10
10


Output:
Element is present at index 2
*/
