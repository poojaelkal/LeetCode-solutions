class Solution:
    def luckyNumbers (self, matrix: List[List[int]]) -> List[int]:
        res = []
        minr = []
        maxr=[]
        for i in matrix:
            minr.append(min(i))
        for i in zip(*matrix):
            maxr.append(max(i))
        for i in range(len(minr)):
            for j in range(len(maxr)):
                if minr[i]==maxr[j]:
                    res.append(minr[i])
        return res
