class Solution:
    def groupThePeople(self, groupSizes: List[int]) -> List[List[int]]:
        res = []
        samp = collections.defaultdict(list)
        for i, size in enumerate(groupSizes):
            samp[size].append(i)
            if len(samp[size]) == size:
                res.append(samp.pop(size))
        return res
