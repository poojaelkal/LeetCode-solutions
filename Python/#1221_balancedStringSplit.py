class Solution:
    def balancedStringSplit(self, s: str) -> int:
        count = 0
        ref = 0
        for i in s:
            if i == 'R':
                ref -=1
            else:
                ref +=1
            if ref == 0:
                count += 1
        return count
        
