class Solution:
    def average(self, salary: List[int]) -> float:
        mins = min(salary)
        maxs=max(salary)
        avg=0
        count=0
        for i in salary:
            if i!=mins and i!=maxs:
                avg+=i
                count+=1
        return avg/count
