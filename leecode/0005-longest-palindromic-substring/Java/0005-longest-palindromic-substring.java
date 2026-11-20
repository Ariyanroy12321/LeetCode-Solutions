class Solution {
    public String longestPalindrome(String s) {
        String max="";
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            String curr="" + s.charAt(i);
            int l=i-1;
            int r=i+1;
            while(l>=0 && s.charAt(l) == s.charAt(i))
            {
                    curr=curr+s.charAt(l);
                    l--;
            }
            while(r<n && s.charAt(r) == s.charAt(i))
            {
                    curr=curr+s.charAt(r);
                    r++;
            }
            while(l>=0 && r<n)
            {
                if(s.charAt(l) == s.charAt(r))
                {
                    curr=s.charAt(l)+curr+s.charAt(l);
                    l--;
                    r++;
                    continue;
                }
                break;
            }
            if(max.length() < curr.length())
            {
                max=curr;
            }
        }
        return max;
    }
}