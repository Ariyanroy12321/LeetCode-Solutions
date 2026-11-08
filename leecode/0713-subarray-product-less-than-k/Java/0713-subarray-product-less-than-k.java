class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
       int l=0,r=0,c=0,pro=1;
       while(r<nums.length)
       {
            pro=pro*nums[r];
            while(pro >= k)
            {
                pro/= nums[l];
                l++; 
            }
            if(pro<k)
            {
                c=c+(r-l+1);
            }
            r++;
       }
       return c;
    }
}