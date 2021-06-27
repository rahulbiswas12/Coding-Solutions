class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current_number_of_once= 0;
        
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 1) {
                current_number_of_once += 1;
                max = Math.max(max, current_number_of_once);   
            } else {
                current_number_of_once = 0;
            }
        }
        return max;
    }
}
