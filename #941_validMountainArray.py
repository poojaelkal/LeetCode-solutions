class Solution:
    def validMountainArray(self, A: List[int]) -> bool:
        i = 0
        j = len(A)-1
        n = len(A)
        while i<n-1 and A[i]<A[i+1]:
            i += 1
        while j>0 and A[j]<A[j-1]:
            j -= 1
        return 0<i==j<n-1
