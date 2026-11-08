class Solution {
    public int lengthOfLongestSubstring(String s) {
        int c=0,l=0,r=0,n=s.length(),max=0;
        HashSet <Character> check=new HashSet<>();
        while(r<n)
        {
            char x=s.charAt(r);
            if(!check.contains(x))
            {
                c++;
                check.add(x);
                r++;
                continue;
            }
            max=Math.max(max,c);
            check.remove(s.charAt(l));
            l++;
            c--;
        }
        return Math.max(max,c);
    }
}