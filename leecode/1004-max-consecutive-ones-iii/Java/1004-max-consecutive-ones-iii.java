class Solution {
    public int longestOnes(int[] nums, int k) {
        int l,r;
        l=r=0;
        int max=0;
        int c=0;

        while(r < nums.length)
        {
            if(nums[r] == 1)
            {
                max=Math.max(max,r-l+1);
                r++;
            }
            else if(c<k)
            {
                max=Math.max(max,r-l+1);
                c++;
                r++;
            }
            else
            {
                while(l<r && nums[l] == 1)
                {
                    l++;
                }
                l++;
                c--; 
            }
        }
        return max;
    }
}