class Solution:
    def checkIfCanBreak(self, s1: str, s2: str) -> bool:
        s1=''.join(sorted(s1))
        s2=''.join(sorted(s2))
        return self.check(s1,s2) or self.check(s2,s1)
    def check(self, s1, s2):
        for i in range(len(s1)):
            if s1[i]<s2[i]:
                return False
        return True
        
                    
        
