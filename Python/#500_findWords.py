class Solution:
    def findWords(self, words: List[str]) -> List[str]:
        result = []
        lines = [set("qwertyuiop"),set("asdfghjkl"),set("zxcvbnm")]
        for word in words:
            uni = set(word.lower())
            if uni.issubset(lines[0]) or uni.issubset(lines[1]) or uni.issubset(lines[2]):
                result.append(word)
        return result
        
