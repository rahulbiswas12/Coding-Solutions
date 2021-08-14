/*
Sample Input 1:
0 
100 
20
Sample Output 1:
0   -17
20  -6
40  4
60  15
80  26
100 37
Sample Input 2:
20
119
13
Sample Output 2:
20  -6
33  0 
46  7
59  15
72  22
85  29
98  36
111 43
*/

import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
		
		int currentFahrenhietValue = start;
		while(currentFahrenhietValue <= end){
			int celsiusValue = (int)((5.0 / 9) * (currentFahrenhietValue - 32));
			System.out.println(currentFahrenhietValue +"\t" +celsiusValue);
			currentFahrenhietValue += step;
		}
	}
}
