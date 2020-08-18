class Solution:
    def numSpecialEquivGroups(self, A: List[str]) -> int:
        d=set()
        for i in A:
            even=''.join(sorted(i[0::2]))
            odd=''.join(sorted(i[1::2]))
            d.add((even,odd))
        return len(d)
        
