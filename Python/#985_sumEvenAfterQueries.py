class Solution:
    def sumEvenAfterQueries(self, A: List[int], queries: List[List[int]]) -> List[int]:
        B = []
        sum = 0
        for i in A:
            if i % 2 == 0:
                sum += i
        for val,ind in queries:
            if A[ind] % 2 == 0:
                sum -= A[ind]
            A[ind] += val
            if A[ind] % 2 == 0:
                sum += A[ind]
            B.append(sum)
                    
        return B
