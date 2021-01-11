class Solution:
    def toLowerCase(self, str: str) -> str:
        for i in str:
            if ord(i) > 64 and ord(i) < 91:
                n = ord(i) + 32
                str = str.replace(i,chr(n))
        return str
        
