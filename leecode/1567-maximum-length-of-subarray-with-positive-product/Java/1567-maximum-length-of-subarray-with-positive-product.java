class Solution {
    public int getMaxLen(int[] nums) {
        
        double p=1;
        double s=1;
        int max=0;
        int x=0;
        
        int n=nums.length;
        int y=n-1;

        for(int i=0;i<n;i++)
        {
            p*=(double)nums[i];
            s*=(double)nums[n-i-1];
            if(p>0)
            {
                p=1;
                max=Math.max(max,i-x+1);
            }
            else if(p==0)
            {
                p=1;
                x=i+1;
            }
            else
            {
                p=-1;
            }
            if(s>0)
            {
                max=Math.max(max,y-(n-i-1)+1);
            }
            else if(s==0)
            {
                s=1;
                y=n-i-2;
            }
            else
            {
                s=-1;
            }
        }
        return max;
    }
}