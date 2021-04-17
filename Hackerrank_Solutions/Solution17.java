// Java String Reverse

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int a_pointer = 0;
        int b_pointer = A.length()-1;
        
        while (a_pointer <= b_pointer) {
            if (A.charAt(a_pointer) != A.charAt(b_pointer)) {
                System.out.println("No");
                return;
            }
            a_pointer++;
            b_pointer--;
        }
        System.out.println("Yes");
        
    }
}



