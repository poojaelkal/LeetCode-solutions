class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        code = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        s = set()
        for word in words:
            st = ""
            for i in word:
                charNum = ord(i)-ord('a')
                st += code[charNum]

            if st not in s:
                print(st)
                s.add(st)
        return len(s)
