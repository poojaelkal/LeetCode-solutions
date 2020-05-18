class Solution:
    def flipAndInvertImage(self, A: List[List[int]]) -> List[List[int]]:
        res = []
        for each in A:
            each.reverse()
            res.append(each)
        for i in res:
            for j in range(len(i)):
                i[j] = i[j]^1
        return res
        
