class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        res = []
        if len(s) < len(p):
            return res
        hs, hf = 0, 0
        for i in range(len(p)):
            hs += hash(s[i])
            hf += hash(p[i])
        if hs == hf:
            res.append(0)
        for r in range(len(p),len(s)):
            hs += hash(s[r]) - hash(s[r-len(p)])
            if hs == hf:
                res.append(r - len(p) + 1)
        return res
        
