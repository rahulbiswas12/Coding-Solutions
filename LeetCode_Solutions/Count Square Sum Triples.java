// Biweekly Contest 56

class Solution {
    public int countTriples(int n) {
       int count =0;
        int ans;
        int a, b, c;

        for (a = 1; a <= n; a++) {
        for (b = a; b <= n; b++) {
            for (c = 1; c <= n; c++) {
                if (a * a + b * b == c * c) {
                    count++;
                }
                else
                    continue;                  
            }
        }
    }
        ans = count*2;
        return ans;
    }
    
}
