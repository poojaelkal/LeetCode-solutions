class Solution:
    def countBinarySubstrings(self, s: str) -> int:
        prevRun=1
        currRun=1
        res=0
        s=list(s)
        for i in range(1,len(s)):
            if s[i]==s[i-1]:
                currRun+=1
            else:
                prevRun=currRun
                currRun=1
            if prevRun>=currRun:
                res+=1
        return res
                
        
