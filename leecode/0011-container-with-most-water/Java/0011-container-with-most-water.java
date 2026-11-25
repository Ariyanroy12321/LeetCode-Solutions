class Solution {
    public int maxArea(int[] height) {

        int r=height.length-1,l=0;
        int max=0,curr=0;

        while(l<r)
        {
            curr=(r-l)*Math.min(height[l],height[r]);
            max=Math.max(curr,max);
            boolean c=(Math.min(height[l],height[r])==height[l])?true:false;
            
            if(c)
            {
                int x=l+1;
                while(height[x] < height[l])
                {
                    x++;
                }
                l=x;
            }
            else
            {
                int x=r-1;
                while(height[x] < height[r])
                {
                    x--;
                }
                r=x;
            }
        }
        return max;
    }
}