class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int l,r;
        int result=nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(int point=0; point <nums.length-2; point++)
        {
            l=point+1;
            r=nums.length-1;
            while(l<r)
            {
                int sum=nums[point] + nums[l] + nums[r];
                if(Math.abs(target - sum) < Math.abs(target - result))
                {
                    result=sum;
                }
                if(sum > target)
                {
                    r--;
                }
                else if(sum < target)
                {
                    l++;
                }
                else
                {
                    return target;
                }
            }
        }
        return result;
    }
}