class Solution:
    def maxRotateFunction(self, A: List[int]) -> int:
        diff, curr = sum(A), sum([num * i for (i, num) in enumerate(A)])
        res = curr
        for i in range(len(A) - 1, 0, -1):
            curr += diff - A[i] * len(A)
            res = max(res, curr)
        return res
