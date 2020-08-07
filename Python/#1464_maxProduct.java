class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        max1 = max(nums)
        maxind = nums.index(max1)
        nums.pop(maxind)
        max2 = max(nums)
        return (max1-1)*(max2-1)
