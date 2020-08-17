class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        count=0
        c=Counter(chars)
        for each in words:
            c1=Counter(each)
            flag=True
            for key in c1.keys():
                if c1[key]>c[key]:
                    flag=False
                    break
            if flag:
                count+=len(each)
        return count
