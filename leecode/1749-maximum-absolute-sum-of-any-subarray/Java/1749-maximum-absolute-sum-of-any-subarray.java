class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int ncurr,pcurr;
        int maxsum,minsum;
        int n=nums.length;
        ncurr=pcurr=maxsum=minsum=nums[0];
        for(int i=1;i<n;i++)
        {
            pcurr=Math.max(pcurr+nums[i],nums[i]);
            ncurr=Math.min(ncurr+nums[i],nums[i]);
            maxsum=Math.max(maxsum,pcurr);
            minsum=Math.min(minsum,ncurr);
        }
        return Math.max(maxsum,Math.abs(minsum));
    }
}