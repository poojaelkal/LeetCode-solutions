class Solution:
    def longestPalindrome(self, s: str) -> int:
        res = 0
        single = 0
        count = {}
        for each in s:
            count[each] = count.get(each, 0) + 1
        for i in count:
            if count[i]%2 == 0:
                res += count[i]
            else:
                res += count[i]-1
                single = 1
        return res+single
