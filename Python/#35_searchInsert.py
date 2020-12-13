class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        if nums is None:
            return None
        for i, num in enumerate(nums):
            if num>=target:
                return i
        return i+1
        
