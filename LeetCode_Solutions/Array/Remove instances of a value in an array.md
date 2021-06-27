Code:

class Solution {
    public int removeElement(int[] nums, int val) {
        int len=nums.length;
        int index=0;
        int flag=0;
      
            
        for(int i=0;i<len;i++)
        {
            if(nums[i]!=val)
            {
                nums[index++]=nums[i];
                flag=1;
            }
            if(nums[i]==val)
                flag=1;
        }
        
        if(flag==1)
        return index;
        
        else
            return nums.length;
    }
}

![image](https://user-images.githubusercontent.com/49182089/123534626-0e213900-d73c-11eb-9fdc-aba6b01c872d.png)
