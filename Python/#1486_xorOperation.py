class Solution:
    def xorOperation(self, n: int, start: int) -> int:
        nums = []
        xor = 0;
        for i in range(0,n):
            nums.append(start+2*i)
        for i in nums:
            xor = xor^i
        return xor
