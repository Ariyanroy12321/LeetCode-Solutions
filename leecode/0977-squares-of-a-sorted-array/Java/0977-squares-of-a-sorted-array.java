class Solution {
    public int[] sortedSquares(int[] arr) {
        int sq[]= new int[arr.length];
        int l=0;
        int r=arr.length-1;
        int x=r;
        while(l<=r)
        {
            if((arr[l] * arr[l]) > (arr[r] * arr[r]))
            {
                sq[x]=arr[l]*arr[l];
                l++;
            }
            else
            {
                sq[x]=arr[r]*arr[r];
                r--;
            }
            x--;
        }
        return sq;
    }
}