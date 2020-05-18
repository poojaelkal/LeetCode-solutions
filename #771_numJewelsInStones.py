class Solution:
    def numJewelsInStones(self, J: str, S: str) -> int:
        J = list(J)
        S = list(S)
        count = 0
        for each in S:
            if each in J:
                count += 1

        return count
        
