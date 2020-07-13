class Solution:
    def oddCells(self, n: int, m: int, indices: List[List[int]]) -> int:
        oddNum = 0
        row = [0]*n
        col = [0]*m
        for i,j in indices:
            row[i] = row[i]^1
            col[j] = col[j]^1
        for i in range(n):
            for j in range(m):
                if row[i]^col[j] == 1:
                    oddNum += 1
        return oddNum
        
