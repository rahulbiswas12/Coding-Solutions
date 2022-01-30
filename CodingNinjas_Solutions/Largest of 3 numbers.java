/*
Problem Statement
Write a program that takes three numbers a,b, and c as input and prints the largest number amongst them.
Sample Input 1 :
4 6 1
Sample Output 1 :
6
-----------------------------------------------------------------------------------------
*/

import java.util.Scanner;
class Solution {	
	public static void main(String args[]) {		
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();		
		int largest;		
		if(a >= b && a >= c) {
			largest = a;
		}		
		else if(b >= a && b >= c) {
			largest = b;
		}
		else {
			largest = c;
		}
		System.out.println(largest);	
	}
}
