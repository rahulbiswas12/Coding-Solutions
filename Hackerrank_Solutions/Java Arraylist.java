import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList[] al = new ArrayList[20000];
        Scanner scanner = new Scanner(System.in);
        int lists = scanner.nextInt();
        
        for (int i = 0; i < lists; i++) {
            al[i] = new ArrayList();
            int number = scanner.nextInt();
            for (int j = 0; j < number; j++) {
                int value = scanner.nextInt();
                al[i].add(value);
            }
        }
        int  queries = scanner.nextInt();
        for (int i = 0; i < queries; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try {
                System.out.println(al[x-1].get(y-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
