class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        sum1=0
        nums.sort()
        for i in range(0,len(nums)-1,2):
            sum1+=min(nums[i],nums[i+1])
        return sum1
