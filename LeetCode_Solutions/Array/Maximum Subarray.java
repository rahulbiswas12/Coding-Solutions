class Solution {
    public int maxSubArray(int a[]) {
        int maxSum = 0;
        int curSum = 0;
        
        for (int i = 1; i < a.length; i++) {
            curSum = curSum + a[i];
            
            if(curSum > maxSum) {
                maxSum = curSum;
            }
            if(curSum<0) {
                curSum = 0;
            }
        }
        return maxSum ;
    }
}

//  https://www.youtube.com/watch?v=HCL4_bOd3-4
