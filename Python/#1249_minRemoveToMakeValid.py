class Solution:
    def minRemoveToMakeValid(self, s: str) -> str:
        stack=[]
        result=list(s)
        for i,c in enumerate(s):
            if c=='(':
                stack.append(i)
            elif c==')':
                if stack:
                    stack.pop()
                else:
                    result[i]=''
        for i in stack:
            result[i]=''
        return ''.join(result)
            
        
