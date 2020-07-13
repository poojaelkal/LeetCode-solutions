class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        l = [int(i) for i in str(n)]
        sum1 = 0
        prod = 1
        for i in l:
            sum1 += i
            prod *= i
        return prod - sum1
        
