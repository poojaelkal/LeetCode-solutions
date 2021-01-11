class Solution:
    def repeatedNTimes(self, A: List[int]) -> int:
        count = {}
        for i in A:
            if i in count:
                count[i] +=1
                return i
            else:
                count[i] = 1
