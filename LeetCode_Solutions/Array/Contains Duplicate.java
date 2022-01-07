class Solution {
    public boolean containsDuplicate(int[] nums) {
        int size=nums.length;
        boolean num = false;
        Arrays.sort(nums);
        for(int i=0; i<size-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                num=true;
                break;
            }
        }
        return num;
    }
}


----------------- Solution 2 -----------------
    
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: nums) {
            if(set.contains (i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }
}
