class Solution:
    def reverseOnlyLetters(self, S: str) -> str:
        i=0
        j=len(S)-1
        s=list(S)
        while(i<j):
            if s[i].isalpha()==False:
                i+=1
            elif s[j].isalpha()==False:
                j-=1
            else:
                s[i],s[j]=s[j],s[i]
                i+=1
                j-=1
        return ''.join(s)
            
        
