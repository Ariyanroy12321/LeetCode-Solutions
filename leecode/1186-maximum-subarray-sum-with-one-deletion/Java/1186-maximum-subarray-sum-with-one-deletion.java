class Solution {
    public int maximumSum(int[] arr) {
        int maxsum=arr[0];
        int currsum=arr[0];
        int consum=arr[0];
        int n=arr.length;
        int x=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]<0 && x==1 && currsum-consum >arr[i])
            {
                consum=currsum;
                
            }
            else if(arr[i]<0 && x==0)
            {
                x=1;
            }
            else
            {
                consum=Math.max(arr[i],consum+arr[i]);
                x=(consum == arr[i])?0:x;
                maxsum=Math.max(maxsum,consum);
            }
            currsum=Math.max(arr[i],currsum+arr[i]);
            maxsum=Math.max(maxsum,currsum);
        }
        return maxsum;
    }
}