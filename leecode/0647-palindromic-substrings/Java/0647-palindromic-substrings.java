class Solution {
    public int countSubstrings(String s) {
        int c=0,l,r;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            l=i-1;
            r=i;
            while(r<n && s.charAt(i) == s.charAt(r))
            {
                c+=r-i+1;
                r++;
            }
            i=r-1;
            while(l>=0 && r<n && s.charAt(l) == s.charAt(r))
            {
                c++;
                l--;
                r++;
            }
        }
        return c;
    }
}