class Solution {
    public boolean judgeSquareSum(int c) {
        int l=0;
        int r=(int)Math.sqrt(c);
        while(l<=r)
        {
            long sum = (long)l*l + (long)r*r;
            if(c > sum)
            {
                l++;
            }
            else if(c== sum)
            {
                return true;
            }
            else
            {
                r--;
            }
        }
        return false;
    }
}