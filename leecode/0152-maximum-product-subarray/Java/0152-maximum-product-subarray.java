class Solution {
    public int maxProduct(int[] nums) {
        int maxsum=nums[0];
        int n=nums.length;
        int preffix=1,suffix=1;
        int x=n-1;
        
        for(int i=0;i<n;i++)
        {
            preffix*= nums[i];
            suffix*= nums[x-i];

            maxsum = Math.max(Math.max(maxsum,suffix),preffix); 
             if(preffix == 0)
            {
                preffix=1;
            }
            if(suffix == 0)
            {
                suffix=1;
            }
        }
        return maxsum;
    }
}