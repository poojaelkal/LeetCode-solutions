class Solution:
    def customSortString(self, S: str, T: str) -> str:
        res = []
        for i in S:
            res.append(i*T.count(i))
        for j in T:
            if j not in S:
                res.append(j)
        return ''.join(res)
            
        
        
