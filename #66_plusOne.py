class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        r = ""
        res = []
        for i in digits:
            s = str(i)
            r = r + s
        r = int(r)
        r = r+1
        num = str(r)
        n = [int(x) for x in num]
        for a in n:
            res.append(a)
        return res
        
