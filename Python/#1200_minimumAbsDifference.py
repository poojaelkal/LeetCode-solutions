class Solution:
    def minimumAbsDifference(self, arr: List[int]) -> List[List[int]]:
        arr.sort()
        mini=sys.maxsize
        for i in range(1,len(arr)):
            mini=min(mini,abs(arr[i]-arr[i-1]))
        res=[]
        for i in range(1,len(arr)):
            if abs(arr[i]-arr[i-1])==mini:
                res.append((arr[i-1],arr[i]))
        return res
            
            
            
        
