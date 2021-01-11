class Solution:
    def minAddToMakeValid(self, S: str) -> int:
        arr = []
        for i in S:
            if i == '(':
                arr.append(i)
            else:
                if len(arr)<1:
                    arr.append(i)
                else:
                    x = arr.pop()
                    if x == ')':
                        arr.append(x)
                        arr.append(i)
        return len(arr)
