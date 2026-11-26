class Solution {
    public String convert(String s, int numRows) {

        if(s.length() == numRows || numRows == 1)
        {
            return s;
        }

        String ans="";
        int x=numRows-1;
        int y=x+x;

        for(int i=0;i<=x;i++)
        {
            int j=i;
            while(j<s.length())
            {
                ans=ans+s.charAt(j);
                if(y!=0 && y!=x+x && j+y < s.length())
                {
                    ans=ans+s.charAt(j+y);
                }
                j=j+x+x;
            }
            y=y-2;
        }

        return ans;

    }
}