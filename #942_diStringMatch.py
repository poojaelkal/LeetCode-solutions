class Solution:
    def diStringMatch(self, S: str) -> List[int]:
        A = []
        i = 0
        j = len(S)
        for st in S:
            if st == "I":
                A.append(i)
                i += 1
            else:
                A.append(j)
                j -= 1
        A.append(j)
        return A
        
