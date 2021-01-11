class Solution:
    def backspaceCompare(self, S: str, T: str) -> bool:
        stack1,stack2 = [], []
        for i in S:
            if i =='#':
                if stack1:
                    stack1.pop()
                
            else:
                stack1.append(i)
        for i in T:
            if i =='#':
                if stack2:
                    stack2.pop()
                
            else:
                stack2.append(i)
        return stack1 == stack2
