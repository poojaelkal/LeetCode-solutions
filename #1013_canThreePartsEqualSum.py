class Solution:
    def canThreePartsEqualSum(self, A: List[int]) -> bool:
        sum = 0
        for i in A:
            sum+=i
        if sum%3 !=0:
            return False
        part = 0
        count =0
        for i in A:
            part += i
            if part==sum/3:
                part = 0
                count+=1
                if count == 3:
                    return True
        return False
