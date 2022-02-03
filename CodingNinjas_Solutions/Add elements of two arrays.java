import java.io.*;
import java.util.*;
public class Example {
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
  
    int n = sc.nextInt(); // size of first array1
    int m = sc.nextInt(); // size of first array2
    int[] array1 = new int[n];
        int[] array2 = new int[m];
        
        for(int i = 0 ; i < n ; i++){
            array1[i] = sc.nextInt(); // taking input in array1
        }
        
        for(int i = 0 ; i < m ; i++){
            array2[i] = sc.nextInt(); // taking input in array2
        }
        
        int result = 0;
        for (int i = 0; i < array1.length; i++) {
            result += array1[i];
        }
        
        for (int i = 0; i < array2.length; i++) {
            result += array2[i];
        }
        
        System.out.println(result);
}
}

/*
Input:
4 5
2 3 4 5
10 20 30 40 50

Output:
164
*/
// https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120299/offering/1459214
