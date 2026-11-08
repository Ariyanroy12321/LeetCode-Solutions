
class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) continue;

            int slow = i, fast = i;
            boolean forward = nums[i] > 0;

            while (true) {
                slow = next(nums, slow, forward);
                if (slow == -1) break;

                fast = next(nums, fast, forward);
                if (fast == -1) break;

                fast = next(nums, fast, forward);
                if (fast == -1) break;

                if (slow == fast) return true;
            }

            int j = i;
            while (nums[j] != 0 && (nums[j] > 0) == forward) {
                int next = ((j + nums[j]) % n + n) % n;
                nums[j] = 0;
                j = next;
            }
        }

        return false;
    }

    private int next(int[] nums, int i, boolean forward) {
        if (nums[i] == 0 || (nums[i] > 0) != forward)
            return -1;

        int n = nums.length;
        int j = ((i + nums[i]) % n + n) % n;

        if (j == i) return -1;

        return j;
    }
}