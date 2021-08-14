import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int basic = s.nextInt();
		char grade = s.next().charAt(0);
		
		double hra = 0.2 * basic;
		double da = 0.5 * basic;
		
		int allowance;
		if(grade == 'A') {
			allowance = 1700;
		}
		else if(grade == 'B') {
			allowance = 1500;
		}
		else {
			allowance = 1300;
		}
		
		double pf = 0.11 * basic;
		
		double totalSalary = basic + hra + da + allowance - pf;
		int ans = (int) Math.round(totalSalary);
		System.out.println(ans);
	}
}

/*
Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf
Where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.
Round off the total salary and then print the integral part only.
Note: Try finding out a function on the internet to do so
Input Format :
Basic salary & Grade (separated by space)
Output Format :
Total Salary
Constraints :
0 <= Basic Salary <= 7,500,000

Sample Input 1 :
10000 A
Sample Output 1 :
17600

Sample Input 2 :
4567 B
Sample Output 2 :
8762
*/
