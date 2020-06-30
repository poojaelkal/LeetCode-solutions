class Solution:
    def sortString(self, s: str) -> str:
        s = list(s)
        res = ''
        while s:
            for small in sorted(set(s)):
                res+=small
                s.remove(small)
            for large in sorted(set(s), reverse=True):
                res+=large
                s.remove(large)
        return res
                
        
            
        
