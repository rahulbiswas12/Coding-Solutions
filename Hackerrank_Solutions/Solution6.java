// Java Loops I 

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution6 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for (int i=1; i<=10; i++) {
            System.out.print(N);
            System.out.print(" x ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(N*i);
        
        }

        scanner.close();
    }
}

