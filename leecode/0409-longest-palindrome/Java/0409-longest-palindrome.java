class Solution {
    public int longestPalindrome(String s) {
        
        HashMap<Character,Integer> freq=new HashMap<>();
        int c=0;
        boolean check=false;
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            freq.put(a,freq.getOrDefault(a,0)+1);
        }
        for(int val:freq.values())
        {   
            c+=val/2;
            check=(val%2 == 0)?check:true;
        }
        c=2*c;
        c+=(check)?1:0;
        return c;
    }
}