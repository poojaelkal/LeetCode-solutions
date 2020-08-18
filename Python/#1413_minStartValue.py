class Solution:
    def minStartValue(self, nums: List[int]) -> int:
        minSum=0
        minTrace=1
        for i in range(len(nums)):
            minSum+=nums[i]
            minTrace=min(minTrace,minSum)
        if minTrace>=1:
            return 1
        return -minTrace+1
            
                
