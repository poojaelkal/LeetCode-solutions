class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        res = []
        for i in range(0,len(nums),2):
            fre = nums[i]
            val = nums[i+1]
            for j in range(fre):
                res.append(val)
        return res
