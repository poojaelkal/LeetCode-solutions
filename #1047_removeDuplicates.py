class Solution:
    def removeDuplicates(self, S: str) -> str:
        res = []
        for i in S:
            if res and i == res[-1]:
                res.pop()
            else:
                res.append(i)
        return ''.join(res)
