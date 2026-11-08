class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        sum=0
        l=[]
        for i in range(0,len(nums)):
            for j in range(i+1,len(nums)):
                sum=nums[j]+nums[i]
                if sum == target :
                    break
            if sum == target:
                break
        l.append(i)
        l.append(j)
        return l