class Solution:
    def numSplits(self, s: str) -> int:
        total = collections.Counter(s)
        alter = collections.Counter()
        result = 0
        for i in range(len(s)):
            char = s[i]
            total[char] -=1
            if total[char] == 0:
                del total[char]
            alter[char] += 1
            if len(total) == len(alter):
                result +=1
        return result
            
        
