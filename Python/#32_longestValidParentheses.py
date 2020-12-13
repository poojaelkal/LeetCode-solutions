class Solution:
    def longestValidParentheses(self, s: str) -> int:
        arr = [0]
        count = 0
        for i in s:
            if i == '(':
                arr.append(0)
            else:
                if len(arr)>1:
                    x = arr.pop()
                    arr[-1] += x + 2
                    count = max(count, arr[-1])
                else:
                    arr = [0]
        return count
