class Solution:
    def removeOuterParentheses(self, S: str) -> str:
        stack = []
        opend = 0
        for i in S:
            if i == '(' and opend>0:
                stack.append(i)
            if i == ')' and opend>1:
                stack.append(i)
            opend+=1 if i == '(' else -1
        return ''.join(stack)
