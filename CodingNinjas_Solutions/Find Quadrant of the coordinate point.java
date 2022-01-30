/*
Write a program to accept a coordinate point in an XY coordinate system and determine in which quadrant the coordinate point lies.
Print
"1st Quadrant": if  +x,+y
"2nd Quadrant": if -x,+y
"3rd Quadrant": if -x,-y
"4th Quadrant": if +x,-y
"x axis": if x,0
"y axis": if 0,y
"Origin": if 0,0
 Input 1 :
5 100
Output 1 :
1st Quadrant
*/

import java.util.Scanner;
class Solution {
	public static void main(String args[]) {		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();	
        
		if(x > 0 && y > 0) {
			System.out.println("1st Quadrant");
		}
		else if(x < 0 && y > 0) {
			System.out.println("2nd Quadrant");
		}
		else if(x < 0 && y < 0) {
			System.out.println("3rd Quadrant");
		}
		else if(x > 0 && y < 0) {
			System.out.println("4th Quadrant");
		}
		else if(x == 0 && y == 0) {
			System.out.println("Origin");
        }
		else if(x == 0 && y != 0) {
			System.out.println("y axis");
		}
		else {
			System.out.println("x axis");
		}
		   
	}
}
