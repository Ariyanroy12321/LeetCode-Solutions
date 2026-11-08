
class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        while(i >=0 || j>=0)
        {
            i=valid(s,i);
            j=valid(t,j);

            if(i<0 || j<0)
            {
                return i==j;
            }

            if(s.charAt(i) != t.charAt(j))
            {
                return false;
            }
            i--;
            j--;
        }
        return true;
    }

    public int valid(String str,int i)
    {
        int skip=0;
        while(skip >= 0)
        {
            if(i>=0 && str.charAt(i) == '#')
            {
                skip++;
            }
            else if(i<0 || skip == 0)
            {
                break;
            }
            else if(skip > 0)
            {
                skip--;
            }
            
            i--;
        }
        return i;
    }
}
