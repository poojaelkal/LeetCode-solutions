class Solution:
    def commonChars(self, A: List[str]) -> List[str]:
        c=Counter(A[0])
        for elem in A[1:]:
            c&=Counter(elem)
        return list(c.elements())
                
        
