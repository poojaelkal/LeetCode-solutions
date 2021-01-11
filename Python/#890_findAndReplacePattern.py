class Solution:
    def findAndReplacePattern(self, words: List[str], pattern: str) -> List[str]:
        return [w for w in words if len(w) == len(pattern) and len(set(w)) == len(set(pattern)) and len(set(zip(w,pattern))) == len(set(w))]
