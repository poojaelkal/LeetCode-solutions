class Solution:
    def canMakeArithmeticProgression(self, arr: List[int]) -> bool:
        arr.sort()
        diff = arr[1]-arr[0]
        for i in range(1, len(arr)-1):
            if diff!=arr[i+1]-arr[i]:
                return False
        return True
