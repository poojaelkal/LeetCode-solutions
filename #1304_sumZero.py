class Solution:
    def sumZero(self, n: int) -> List[int]:
        res = [0]*n
        i = 0
        j = n-1
        while i<j:
            res[i] = n-i
            res[j] = -res[i]
            i += 1
            j -= 1
        return res
