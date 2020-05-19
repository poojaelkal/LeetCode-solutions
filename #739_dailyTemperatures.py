class Solution:
    def dailyTemperatures(self, T: List[int]) -> List[int]:
        res = [0]*len(T)
        stack = []
        for i in range(len(T)):
            while stack and T[stack[-1]]<T[i]:
                curr = stack.pop()
                res[curr] = i - curr
            stack.append(i)
        return res
