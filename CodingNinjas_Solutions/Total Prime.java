import java.util.Scanner;
class CountPrime {
	public int totalPrime(int s, int e) {
		int count = 0;
		boolean flag;		
		for(int i = s; i <= e; i++) {
			if(i == 1 || i == 0) {
				continue;
			}			
			flag = true;
			for(int j  = 2; j <= i / 2; j++) {
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				count++;
			}
		}		
		return count;
	}
}
class Solution {
	public static void main(String args[]) {
		CountPrime obj = new CountPrime();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(obj.totalPrime(s, e));
	}
}
------------------------------------------------------------------------------
Python - 
def totalPrime(S,E):    
    count = 0
    for i in range(S,E + 1):
        flag = True
        for j in range(2,i):
            if i % j == 0:
                flag = False
                break
        if flag:
            count += 1
    return count
S,E = map(int,input().split(' '))
print(totalPrime(S,E))
---------------------------------------------------------------------------
/*
Write a program to find the total number of a primes number in a given interval.
Given two integers S and E, count all primes between S and E.
Input Format :
The only line of input contains two integers S and E separated by a single space.
Output Format :
The only line of the output prints the total number of primes.
Constraints
1 <= N <= 100
Sample Input 1 :
2 10
Sample Output 1 :
4
Explanation Of Sample Input 1:
The prime numbers between 2 and 10
are 2,3,5 and 7
*/
			
