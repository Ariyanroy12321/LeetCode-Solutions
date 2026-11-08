class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int x = m + n - 1;

        m = m - 1;
        n = n - 1;

        while (m >= 0 && n >= 0) {

            if (nums1[m] > nums2[n]) {
                nums1[x] = nums1[m];
                m--;
            } 
            else {
                nums1[x] = nums2[n];
                n--;
            }

            x--;
        }

        while (m >= 0) {
            nums1[x] = nums1[m];
            m--;
            x--;
        }

        while (n >= 0) {
            nums1[x] = nums2[n];
            n--;
            x--;
        }
    }
}