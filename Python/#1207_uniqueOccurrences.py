class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        s = set(arr)
        count = set()
        for i in s:
            counti = arr.count(i)
            if counti in count:
                return False
            count.add(counti)
        return True
