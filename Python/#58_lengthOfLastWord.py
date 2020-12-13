class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        if len(s)<1 or s == " ":
            return 0
        else:
            count = 0
            l = len(s)-1
            while s[l] == " ":
                l = l - 1
                if l == -1:
                    return 0
            for i in range(l,-1,-1):
                if s[i] != " ":
                    count = count + 1
                else:
                    break
        return count
