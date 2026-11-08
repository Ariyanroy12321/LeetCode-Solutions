class Solution {
    public int maxProfit(int[] prices) {
        
        int p=0,b=prices[0];
        
        for(int i=0;i<prices.length;i++)
        {
            if(b<prices[i])
            {
                p=(prices[i]-b)+p;
                b=prices[i];
            }
            if(b>prices[i])
            {
                b=prices[i];
            }
        }
        return p;
    }
}