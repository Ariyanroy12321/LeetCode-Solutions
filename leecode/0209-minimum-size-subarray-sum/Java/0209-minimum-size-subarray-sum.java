class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l,r,sum;
        int c=nums.length+1;
        l=r=sum=0;
        while(r < nums.length)
        {
            sum+= nums[r];
            while(sum >= target)
            {
                c=Math.min(c,(r-l+1));
                sum-=nums[l];
                l++;
            }
                r++; 
        }
        
        return (c==nums.length+1)?0:c;
    }
}