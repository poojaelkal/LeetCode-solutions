class Solution:
    def minFlips(self, target: str) -> int:
        count=0
        status='0'
        for i in target:
            if status!=i:
                count+=1
                status='0' if status=='1' else '1'
        return count
        
