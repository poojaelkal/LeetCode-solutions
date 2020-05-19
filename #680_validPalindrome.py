class Solution:
    def validPalindrome(self, s: str) -> bool:
        i = 0
        j = len(s)-1
        while i<j:
            if s[i]!=s[j]:
                return self.validfunc(s[i:j]) or self.validfunc(s[i+1:j+1])
            i+=1
            j-=1
        return True
    def validfunc(self,s):
        return s == s[::-1]
        
