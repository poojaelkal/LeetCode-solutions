class Solution:
    def reformat(self, s: str) -> str:
        r=''
        a=[]
        n=[]
        for i in list(s):
            if i.isalpha():
                a.append(i)
            else:
                n.append(i)
        if abs(len(a)-len(n))<2:
            while a and n:
                r+=a.pop()+n.pop()
            if a:
                r+=a.pop()
            if n:
                r=n.pop()+r
        return r
