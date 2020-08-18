class Solution:
    def findLucky(self, arr: List[int]) -> int:
        check=Counter(arr)
        maxi=-1
        for k,v in check.items():
            if k==v:
                maxi=max(maxi,k)
        return maxi
        
