class Solution:
    def duplicateZeros(self, arr: List[int]) -> None:
        """
        Do not return anything, modify arr in-place instead.
        """
        count = arr.count(0)
        n = len(arr)
        for i in range(n-1,-1,-1):
            if i+count<n:
                arr[i+count] = arr[i]
            if arr[i] == 0:
                count -= 1
                if i + count < n:
                    arr[i+count] = 0
