class Solution {
    public boolean isHappy(int n) {
        
        int fast,slow;
        fast=slow=n;
        do
        {
            slow=sumsq(slow);
            if(slow == 1)
            {
                return true;
            }
            fast=sumsq(sumsq(fast));
        }while(slow != fast);
        return false;
    }
    public int sumsq(int num)
    {
        int sum=0;
        while(num >0 )
        {
            int d=num%10;
            sum+=d*d;
            num/=10;
        }
        return sum;
    }
}