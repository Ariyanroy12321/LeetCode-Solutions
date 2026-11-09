
class Solution {
    public int reverse(int x) {
        long s = 0;

        while (x != 0) {
            int d = x % 10;
            s = s * 10 + d;
            x = x / 10;

            if (s > Integer.MAX_VALUE || s < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) s;
    }
}
