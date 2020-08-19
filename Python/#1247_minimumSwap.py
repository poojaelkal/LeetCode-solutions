class Solution:
    def minimumSwap(self, s1: str, s2: str) -> int:
        x=0
        y=0
        for i in range(len(s1)):
            if s1[i]!=s2[i] and s1[i]=='x':
                x+=1
            if s1[i]!=s2[i] and s1[i]=='y':
                y+=1
        if (x+y)%2==1:
            return -1
        if x%2==1 and y%2==1:
            return x//2+y//2+2
        return x//2+y//2
            
        
