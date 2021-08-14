import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		int i = 0;
         	while(i <= n){
    			sum = sum + i;
    			i = i + 2;
  		}
		System.out.println(sum);
	}
}
