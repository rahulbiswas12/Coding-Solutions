/*
Sample Input 1 :
A
3 4 6
Sample Output 1 :
A
4
Sample Input 2 :
T
7 3 8
Sample Output 2 :
T
6
*/

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		char name = s.next().charAt(0);
		int m1,m2,m3;
		m1= s.nextInt();
		m2 = s.nextInt();
		m3 = s.nextInt();
		int average = (m1 + m2 + m3) / 3;
		System.out.println(name);
		System.out.println(average);		
	}
}
