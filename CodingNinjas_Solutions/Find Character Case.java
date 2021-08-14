import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        char ch = s.next().charAt(0);
        
        if(ch >= 'A' && ch <= 'Z') {
            System.out.println(1);
        }
        else if(ch >= 'a' && ch <= 'z') {
            System.out.println(0);
        }
        else {
            System.out.println(-1);
        }
    }
}

/*
Sample Input 1 :
v
Sample Output 1 :
0
Sample Input 2 :
V
Sample Output 2 :
1
*/
