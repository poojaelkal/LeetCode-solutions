class Solution:
    def countAndSay(self, n: int) -> str:
        if n == 1:
            return "1"
        elif n == 2:
            return "11"
        else:
            s = "11"
            res = "11"
            for i in range(3,n+1):
                count = 1
                s = res
                for j in range(len(s)-1):
                    if j == 0:
                        res = ""
                    if s[j] == s[j+1]:
                        count = count + 1
                    else:
                        res = res + str(count) + s[j]
                        count = 1
                res = res + str(count) + s[j+1]
                   
            return res
