class Solution:
    def scoreOfParentheses(self, S: str) -> int:
        stack=[0]
        for i in S:
            if i=='(':
                stack.append(0)
            else:
                last=stack.pop()
                if last==0:
                    score=1
                else:
                    score=last*2
                stack[-1]+=score
        return stack.pop()
        
        
