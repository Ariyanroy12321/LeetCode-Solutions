
class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> freq = new HashMap<>();

        int l = 0;
        int r = 0;
        int max = 0;
        int mf = 0;

        while (r < s.length()) {

            char ch = s.charAt(r);

            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            // Find maximum frequency
            mf = Collections.max(freq.values());

            int len = r - l + 1;

            // Check if window is valid
            if (len - mf <= k) {
                max = Math.max(max, len);
            } 
            else {
                char leftChar = s.charAt(l);

                freq.put(leftChar, freq.get(leftChar) - 1);
                l++;
            }

            r++;
        }

        return max;
    }
}
