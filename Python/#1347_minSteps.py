class Solution:
    def minSteps(self, s: str, t: str) -> int:
        count = 0
        res = collections.Counter(s)
        for c in t:
            if res[c]>0:
                res[c] -= 1
            else:
                count += 1
        return count
                
