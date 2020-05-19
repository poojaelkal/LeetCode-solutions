class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for i in range(len(s)):
            if s[i] == '(' or s[i] == '{' or s[i] == '[':
                stack.append(s[i])
            if len(s) == 0:
                return False
            if s[i] == ')':
                if len(stack) == 0:
                    return False
                else:
                    x = stack.pop()
                    if x == '{' or x == '[':
                        return False
            elif s[i] == '}':
                if len(stack) == 0:
                    return False
                else:
                    x = stack.pop()
                    if x == '(' or x == '[':
                        return False
            elif s[i] == ']':
                if len(stack) == 0:
                    return False
                else:
                    x = stack.pop()
                    if x == '{' or x == '(':
                        return False
        if len(stack) == 0:
            return True
        else:
            return False
