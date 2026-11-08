class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int l,r,s=nums.length;
        l=r=0;
        Arrays.sort(nums);
        for(int i=0;i<s-3;i++)
        {
            if ((long) nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target)
            break;
            if(i!=0 && nums[i]==nums[i-1])
            {
                continue;
            }
            for(int j=i+1 ;j<s-2;j++)
            {
                
                l=j+1;
                r=s-1;
                
                if(nums[j] == nums[j-1] && j!=(i+1))
                {
                    continue;
                }

                while(l<r)
                {
                    
                    long sum=(long)nums[i]+nums[j]+nums[l]+nums[r];
                    if(sum == target)
                    {
                        result.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        r--;
                        l++;

                        while (l < r && nums[l] == nums[l - 1]) {
                            l++;
                        }

                        while (l < r && nums[r] == nums[r + 1]) {
                            r--;
                        }

                    }
                    else if(sum > target)
                    {
                        r--;
                    }
                    else
                    {
                        l++;
                    }
                }
                
            }
        }
        return result;
    }
}