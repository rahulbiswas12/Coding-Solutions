// Solution 1

class Solution {
    public int maxSubArray(int [] nums) {
        int sum = 0;
        int maxi = nums[0];
        for(int i = 0; i<nums.length;i++) {
            sum += nums[i];
            if(sum > maxi) maxi = sum;
            if(sum < 0) sum =0;
        }
        return maxi;
    }
}

//  https://www.youtube.com/watch?v=w_KEocd__20

// Solution 2

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
