class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length==1)
        {
            return 0;
        }
        int b=prices[0],p=0;
        for(int day : prices)
        {
            if(p<(day-b))
            {
                p=day-b;
            }
            if(day<b)
            {
                b=day;
            }
        }
        return p;
    }
}