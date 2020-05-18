class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        res = []
        for i in nums1:
            n = nums2.index(i)
            while n<len(nums2):
                if (n == len(nums2)-1) or (n == len(nums2)-1 and nums2[n+1]<i):
                    res.append(int('-1'))
                    n=len(nums2)
                else:
                    if nums2[n+1]>i:
                        res.append(nums2[n+1])
                        n=len(nums2)
                n += 1

        return res
