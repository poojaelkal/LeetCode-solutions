class Solution:
    def minTimeToVisitAllPoints(self, points: List[List[int]]) -> int:
        mn = 0
        x,y = points.pop()
        while points:
            x1,y1 = points.pop()
            mn +=max(abs(x1-x),abs(y1-y))
            x,y = x1,y1
        return mn
        
