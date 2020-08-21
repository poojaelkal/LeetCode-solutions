class Solution:
    def romanToInt(self, s: str) -> int:
        sum = 0
        for i in range(len(s)):
            if s[i] == 'V' or s[i] == 'X':
                if i-1>-1 and s[i-1] == 'I':
                    sum = sum + self.values(s[i]) - 2
                else:
                    sum = sum + self.values(s[i])
            elif s[i] == 'L' or s[i] == 'C':
                if i-1>-1 and s[i-1] == 'X':
                    sum = sum + self.values(s[i]) - 20
                else:
                    sum = sum + self.values(s[i])
            elif s[i] == 'D' or s[i] == 'M':
                if i-1>-1 and s[i-1] == 'C':
                    sum = sum + self.values(s[i]) - 200
                else:
                    sum = sum + self.values(s[i])
            else: 
                sum = sum + self.values(s[i])
            
        return sum
                    
        
    def values(self,x):
        if x == 'I':
            return 1
        elif x == 'V':
            return 5
        elif x == 'X':
            return 10
        elif x == 'L':
            return 50
        elif x == 'C':
            return 100
        elif x == 'D':
            return 500
        elif x == 'M':
            return 1000
        else:
            return 0
