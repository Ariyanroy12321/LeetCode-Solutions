import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int point = 0; point < nums.length - 2; point++) {

            // Skip duplicate starting elements
            if (point > 0 && nums[point] == nums[point - 1]) {
                continue;
            }

            int s = point + 1;
            int f = nums.length - 1;

            while (s < f) {
                int sum = nums[point] + nums[s] + nums[f];

                if (sum == 0) {
                    result.add(Arrays.asList(
                        nums[point], nums[s], nums[f]
                    ));

                    s++;
                    f--;

                    // Skip duplicate values at both pointers
                    while (s < f && nums[s] == nums[s - 1]) {
                        s++;
                    }

                    while (s < f && nums[f] == nums[f + 1]) {
                        f--;
                    }
                } 
                else if (sum > 0) {
                    f--;
                } 
                else {
                    s++;
                }
            }
        }

        return result;
    }
}