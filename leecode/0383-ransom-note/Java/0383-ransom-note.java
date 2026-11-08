class Solution {
    public boolean canConstruct(String note, String mag) {
        int[] arr=new int[26];
        
        for(int i=0;i<note.length();i++)
        {
            arr[note.charAt(i)-'a']++;
        }
        for(int i=0;i<mag.length();i++)
        {
            arr[mag.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]>0)
            {
                return false;
            }
        }
        return true;
    }
}