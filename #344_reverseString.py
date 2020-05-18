class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        n = len(s)
        i = 0
        l = n-1
        while l>i:
            s[i],s[l] = s[l],s[i]
            i = i+1
            l = l-1
        return s
