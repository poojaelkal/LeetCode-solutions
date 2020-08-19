class Solution:
    def freqAlphabets(self, s: str) -> str:
        i = len(s)-1
        ans = []
        while i>=0:
            if s[i] == '#':
                ans.append(alpha(s[i-2:i]))
                i -= 3
            else:
                ans.append(alpha(s[i]))
                i-=1
        return ''.join(reversed(ans))

def alpha(num):
    return chr(int(num) + ord('a') - 1)
        
