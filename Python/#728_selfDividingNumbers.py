class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        res = []
        for i in range(left, right+1):
            if '0' in str(i):
                continue
            divided = 0
            for j in str(i):
                if i%int(j) != 0:
                    divided = 1
            if divided == 0:
                res.append(i)
        return res
