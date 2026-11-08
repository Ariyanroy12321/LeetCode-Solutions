class Solution {
    public int majorityElement(int[] nums) {

       if(nums.length ==1)
       {
            return nums[0];
       }

        int freq=0;
        int candi=0;

        for(int num : nums)
        {
            if(freq==0)
            {
                candi=num;
            }
            if(num==candi)
            {
                freq++;
            }
            else
            {
                freq--;
            }
        }
        return candi;
    }
}