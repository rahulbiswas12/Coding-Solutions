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

import java.util.*;
public class Solution
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		if(a > 0 && b > 0)
			System.out.print("1st Quadrant");
		else if(a < 0 && b > 0)
			System.out.print("2nd Quadrant");
		else if(a < 0 && b < 0)
			System.out.print("3rd Quadrant");
		else if(a > 0 && b < 0)
			System.out.print("4th Quadrant");
		else
			System.out.print("Origin");
	}
}
