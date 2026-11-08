class Solution {
    public int removeDuplicates(int[] nums) {
        
        int l=nums.length;
        int k=1,c=1;
        if(l<=2)
        {
            return l;
        }
        
        for(int i=1;i<l;i++)
        {
            if(nums[i]!=nums[k-1])
            {
                c=1;
                nums[k]=nums[i];
                k++;
            }
            else if(c<2)
            {
                c++;
                nums[k]=nums[i];
                k++;
            }
            
        }
        return k;
    }
}